package StackBasedProblems.Easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public static String solution(String s){
        Stack<Character> stack = new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char x =s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==x) stack.pop();
            else stack.push(x);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abbaca"));
        System.out.println(solution("azxxzy"));
        System.out.println(solution("caaacaac"));
    }
}
