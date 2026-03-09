package StackBasedProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public static String solution(String s,int k){
        Stack<HashMap<Character,Integer>> hashMapStack=new Stack<>();
        int len=s.length();

        for(int i=0;i<len;i++){
            char x = s.charAt(i);
            if(!hashMapStack.isEmpty() && hashMapStack.peek().containsKey(x)){
                if(hashMapStack.peek().get(x)+1==k) hashMapStack.pop();
                else{
                    hashMapStack.peek().put(x,hashMapStack.peek().get(x)+1);
                }
            }
            else{
                hashMapStack.push(new HashMap<>(Map.of(x,1)));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!hashMapStack.isEmpty()){
            for(HashMap.Entry<Character,Integer> entry: hashMapStack.peek().entrySet()){
                int count=entry.getValue();
                while (count>0){
                    stringBuilder.append(entry.getKey());
                    count--;
                }
            }
            hashMapStack.pop();
        }
//        System.out.println(hashMapStack);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcd",2));
        System.out.println(solution("deeedbbcccbdaa",3));
        System.out.println(solution("pbbcggttciiippooaais",2));
    }
}
