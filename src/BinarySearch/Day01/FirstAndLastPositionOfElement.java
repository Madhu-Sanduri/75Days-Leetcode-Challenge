package BinarySearch.Day01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Leetcode - 34. Find First and Last Position of Element in Sorted Array
* */
public class FirstAndLastPositionOfElement {

    public static String solution(int []arr,int target){
        int firstIdx=firstPos(arr,target);
        int lastIdx=lastPos(arr,target);
        return Arrays.toString(new int[]{firstIdx,lastIdx});
    }

    static int firstPos(int []arr,int target){
        int len=arr.length;
        int s=0,e=len-1;
        int pos=Integer.MAX_VALUE;
        while (s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid]==target) pos=Math.min(pos,mid);
            if(arr[mid]>=target) e=mid-1;
            else  s=mid+1;
        }

        return  pos==Integer.MAX_VALUE?-1 : pos;
    }

    static int lastPos(int []arr,int target){
        int len=arr.length;
        int s=0,e=len-1;
        int pos=-1;
        while (s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==target) pos=Math.max(pos,mid);
            if(arr[mid]<=target) s=mid+1;
            else e=mid-1;
        }

        return pos;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1},1));
        System.out.println(solution(new int[]{8,10},8));
        System.out.println(solution(new int[]{5,7,7,8,8,10},8));
        System.out.println(solution(new int[]{5,7,7,8,8,8,8,8,10},8));
        System.out.println(solution(new int[]{5,7,7,8,8,10},6));
        System.out.println(solution(new int[]{},0));
    }
}
