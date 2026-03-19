package BinarySearch.Day01;

/*
Basic Binary Search leetcode - 704

* */

public class BinarySearch {
    public static int solution(int []a,int target){
        int len=a.length;
        int s=0,e=len-1;

        while (s<=e){
            int mid = s+(e-s)/2; // why not (s+e)/2 because if sum of(s,e) position > Integer.MAX_VALUE it will break the flow this is best flow

            if(a[mid]==target) return mid;

            if(a[mid]>target) e=mid-1;
            else s=mid+1;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,0,3,5,9,12},9));
        System.out.println(solution(new int[]{-1,0,3,5,9,12},2));
    }
}

