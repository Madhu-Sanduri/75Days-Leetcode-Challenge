package StackBasedProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NGEI {

    public static List<Integer> solution(int []a){
        Stack<Integer> stack=new Stack<>();
        int len=a.length;
        int []out=new int[len];
        Arrays.fill(out,-1);
        for(int i=len-1;i>=0;i--){

            while (!stack.isEmpty() && stack.peek()<a[i]){
                stack.pop();
                continue;
            }

            if(!stack.isEmpty()) out[i]=stack.peek();
            stack.push(a[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:out){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 4}));
        System.out.println(solution(new int[]{6, 8, 0, 1, 3}));
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(solution(new int[]{9,8,7,6,5,4,3,2,1}));
    }
}
