package BinarySearch.Day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CapacityToShipPackages {

    public static int solution(int []a,int days){
        int len=a.length;
        int sum= Arrays.stream(a).sum();
        int max=Arrays.stream(a).max().getAsInt();
        int value = binarySearch(max,sum,a,days);

        return value;
    }

    static int binarySearch(int s,int e,int []a,int days){
        int minWeight=e;
        while (s<=e){
            int mid = s +(e-s)/2;
            int isCal = calculator(mid,a);
            if(isCal<=days) {
                minWeight=Math.min(minWeight,mid);
            }
            if(isCal<=days){
                e=mid-1;
            }
            else s=mid+1;
        }
        return minWeight;
    }

    static int calculator(int k,int []a){
        int sum=0;
        int count=1;
        for(int i=0;i<a.length;i++){

            if(sum+a[i]>k){
                count++;
                sum=a[i];
            }
            else sum+=a[i];
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10},5));
        System.out.println(solution(new int[]{1,2,3,1,1},4));
        System.out.println(solution(new int[]{3,2,2,4,1,4},3));
    }
}

/*

arr = {1,2,3,4,5,6,7,8,9,10};
sum=55
range should be -> [1,55]

imagine ; k=15

1+2+3+4+5<=15 ->1
6+7<=15 ->2
8 <=15 ->3
9<=15 -> 4
10<=15 ->5

totally 15 be the good value

* */
