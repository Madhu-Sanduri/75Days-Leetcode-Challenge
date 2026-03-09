package StackBasedProblems.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static String solution(int []a){
        Stack<Integer> stack =new Stack<>();
        int len=a.length;
        /*
        stack -> peek element -ve vntey we can push the current element
        stack -> peek element +ve aithey we can compare and collide the current element
        */

        for(int i=0;i<len;i++){
            if(stack.isEmpty() || stack.peek()<0 || a[i]>0) {
                stack.push(a[i]);
                continue;
            }

            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek()>0 && a[i]<0){

                if(stack.peek() == Math.abs(a[i])) {
                    destroyed=true;
                    stack.pop();
                    break;
                }
                else if(stack.peek()<Math.abs(a[i])){
                    stack.pop();
                }
                else {
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(a[i]);
            }

        }

        if(!stack.isEmpty()){
            int []out=new int[stack.size()];
            int idx=out.length-1;
            while (!stack.isEmpty()){
                out[idx--]=stack.pop();
            }
            return Arrays.toString(out);

        }

        return null;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2,-2,1,-2}));
        System.out.println(solution(new int[]{-2,-1,1,2}));
        System.out.println(solution(new int[]{3,5,-6,2,-1,4}));
        System.out.println(solution(new int[]{10,2,-5}));
        System.out.println(solution(new int[]{5,10,-5}));
        System.out.println(solution(new int[]{8,-8}));
    }
}
