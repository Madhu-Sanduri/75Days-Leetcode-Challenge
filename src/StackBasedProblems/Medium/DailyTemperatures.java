package StackBasedProblems.Medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static String solution(int []a){
        Stack<Integer> stack=new Stack<>();
        int len=a.length;
        int []out=new int[len];

        for(int i=len-1;i>=0;i--){

            while(!stack.isEmpty() && a[stack.peek()]<=a[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) out[i]= Math.abs(stack.peek()-i);
            stack.push(i);
        }
        return Arrays.toString(out);
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{73,74,75,71,69,72,76,73}));
        System.out.println(solution(new int[]{89,62,70,58,47,47,46,76,100,70}));
    }
}
