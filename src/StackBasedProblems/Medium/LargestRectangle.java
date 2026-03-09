package StackBasedProblems.Medium;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangle {

    public static int solution(int []a){
        Stack<Integer> stack=new Stack<>();
        int len=a.length;
        int []prevSmallerElement = new int[len];
        int []nextsmallerElement= new int[len];

        //Previous Smaller element;

        for(int i=0;i<len;i++){

            while (!stack.isEmpty() && a[stack.peek()]>=a[i]){
                stack.pop();
            }
            prevSmallerElement[i] = stack.isEmpty()? -1: stack.peek();
            stack.push(i);

        }

        //next smaller element

        stack.clear();
        for(int i=len-1;i>=0;i--){
            while (!stack.isEmpty() && a[stack.peek()]>=a[i]){
                stack.pop();
            }
            nextsmallerElement[i] =stack.isEmpty() ? len : stack.peek();
            stack.push(i);
        }

        int max=0;

        for(int i=0;i<len;i++){
            int width =nextsmallerElement[i] - prevSmallerElement[i] - 1;
            int area = a[i]*width;
            max=Math.max(area,max);
        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,3,5,5,9,2,8,4,7,2,3,8,3,5,4,7,9}));
        System.out.println(solution(new int[]{2,1,5,6,2,3}));
        System.out.println(solution(new int[]{2,4}));
        /*

           [2,1,5,6,2,3]
      nxt  [1,1,2,2,2,3]
      prv  [2,1,1,5,2,2]

        * */
    }
}
