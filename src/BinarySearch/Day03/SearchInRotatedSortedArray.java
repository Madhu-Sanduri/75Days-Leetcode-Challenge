package BinarySearch.Day03;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static int solution(int []a,int k){
        int len=a.length;
        int s=0,e=len-1;

        while (s<=e){
            int mid = s +(e-s)/2;

            if(a[mid]==k) return mid;

            if(a[s]<=a[mid]){
                if(a[s]<=k && a[mid]>k) e=mid-1;
                else s=mid+1;
            }
            else if(a[e]>=a[mid]){
                if(a[e]>=k && a[mid]<k) s=mid+1;
                else e=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7},3));
        System.out.println(solution(new int[]{4,5,6,7,0,1,2},0));
        System.out.println(solution(new int[]{4,5,6,7,0,1,2},3));
        System.out.println(solution(new int[]{1},0));
    }
}
