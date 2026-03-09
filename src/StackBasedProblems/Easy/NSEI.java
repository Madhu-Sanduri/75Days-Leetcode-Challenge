package StackBasedProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NSEI {
    public static ArrayList<Integer> solution(ArrayList<Integer> list){
        Stack<Integer> stack = new Stack<>();
        int len=list.size();
        int []out=new int[len];
        Arrays.fill(out,-1);
        ArrayList<Integer> tempList =new ArrayList<>();
        for(int i=len-1;i>=0;i--){

            while (!stack.isEmpty() && stack.peek()>=list.get(i)){
                stack.pop();
                continue;
            }

            if(!stack.isEmpty()) out[i]=stack.peek();
            stack.push(list.get(i));
        }
        for(int i:out){
            tempList.add(i);
        }

        return tempList;
    }


    public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(List.of(2,1,4,3))));
        System.out.println(solution(new ArrayList<>(List.of(5,4,3,2,1))));
        System.out.println(solution(new ArrayList<>(List.of(3,3,1,1))));
        System.out.println(solution(new ArrayList<>(List.of(3,1,2,4))));
    }
}
