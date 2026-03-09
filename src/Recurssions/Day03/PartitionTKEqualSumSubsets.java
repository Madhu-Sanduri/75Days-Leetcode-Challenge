package Recurssions.Day03;

import java.util.*;

public class PartitionTKEqualSumSubsets {
    public static boolean solution(int []a, int k){
        int len=a.length;
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        if(sum%k!=0 || sum<k) return false;
        int target=sum/k;
        Arrays.sort(a);
        boolean []used = new boolean[len+1];

        return solution(a,0,target,k-1,used,0);

    }

    static boolean solution(int []a, int sum, int target, int k,boolean []used,int start ){

        if(k==1) return true;
        if(target==sum){
            return solution(a,0,target,k,used,0);
        }


        for(int i=start;i<a.length;i++){
            if(used[i] || sum+a[i]>target) continue;
            used[i]=true;
            if(solution(a,sum+a[i],target,k,used,start+1)){
                return true;
            }
            used[i]=false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,3,2,3,5,2,1},4));
    }
}
