package BinarySearch.Day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumDaysToMakeBouquet {

    public static int solution(int []a,int m,int k){
        int len=a.length;
        if(m*k>len) return -1;
        int max= Arrays.stream(a).max().getAsInt();
        int value= binarySearch(1,max,a,m,k);
        return value==Integer.MAX_VALUE?-1:value;
    }

    static int binarySearch(int s,int e,int []a,int m,int k){
        int minDays = Integer.MAX_VALUE;
        while (s<=e){
            int mid = s +(e-s)/2;
            int isValid= isValid(a,mid,k);
            if(isValid>=m) minDays=Math.min(minDays,mid);
            if(isValid>=m){
                e=mid-1;
            }
            else s=mid+1;

        }
        return minDays;
    }

    static int isValid(int []a,int mid,int k){
        int count=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(mid>=a[i]) sum++;
            else sum=0;
            if(sum==k) {
                count++;
                sum=0;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,7,7,7,12,7,7},2,3));
        System.out.println(solution(new int[]{1,10,3,10,2},3,1));
        System.out.println(solution(new int[]{1,10,3,10,2},3,2));
    }
}
