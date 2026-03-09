package StackBasedProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SumSubarrayMinimums {
    public static int solution(int []a){
        Stack<Integer> monotonicStack=new Stack<>();
        int len=a.length;
        int []out = Arrays.copyOf(a,len);
        int sum=0;
        for(int i:a) sum+=i;

        for(int i=len-1;i>=0;i--){
            while (!monotonicStack.isEmpty() && monotonicStack.peek()>a[i]){
                monotonicStack.pop();
                continue;
            }

            if(!monotonicStack.isEmpty()) out[i]=monotonicStack.peek();
            monotonicStack.add(a[i]);
        }

        for(int i=0;i<len;i++){
            sum= (sum+ (len-i-1)*out[i]);
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,4}));
        System.out.println(solution(new int[]{11,81,94,43,3}));
    }
}
