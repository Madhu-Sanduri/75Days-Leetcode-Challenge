package BinarySearch.Day05;

import java.util.Arrays;

public class KokoEatingBanana {
    public static int solution(int []a,int hours){
        int max=Integer.MIN_VALUE;
        for(int i:a) {
            if(max<i) max=i;
        }
        int minIntegers=binarySearch(a,hours,max);
        return minIntegers;

    }

    static int binarySearch(int []a,int hours,int sum){
        int s=1,e=sum;
        int possibleValue=Integer.MAX_VALUE;
        while (s<=e){
            int mid= s+(e-s)/2;
            int isPossible= isPossible(a,mid);
            if(isPossible<=hours) possibleValue =Math.min(possibleValue,mid);
            if(isPossible<=hours){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return possibleValue;
    }

    static int isPossible(int []a,int currentK){
        int sum=0;
        for(int i:a){
            sum = (int) (sum + Math.ceil( (double) i/ (double) currentK));
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{805306368,805306368,805306368},1000000000));
        System.out.println(solution(new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184},823855818));
        System.out.println(solution(new int[]{3,6,7,11},8));
        System.out.println(solution(new int[]{30,11,23,4,20},5));
        System.out.println(solution(new int[]{30,11,23,4,20},6));
    }
}
