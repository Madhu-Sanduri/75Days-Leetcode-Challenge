package BinarySearch.Day05;

import java.util.*;

public class KthMissingNumber {

    public static int solution(int []a,int k){
//        Set<Integer> set=new HashSet<>();
//        for(int i:a) set.add(i);
//        List<Integer> list=new ArrayList<>();
//        int max = Arrays.stream(a).max().getAsInt();
//
//        for(int i=1;i<=max+k;i++){
//            if(!set.contains(i)) list.add(i);
//        }
//
//        return list.get(k-1);
        int len=a.length;
        int s=0,e=len-1;
        while (s<=e){
            int mid = s +(e-s)/2;
            int numberOfEleMissed = a[mid]-(mid+1);
            if(numberOfEleMissed>=k) e=mid-1;
            else s=mid+1;
        }
        return s+k;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,4,7,11},5));
        System.out.println(solution(new int[]{1,2,3,4},3));
        System.out.println(solution(new int[]{1,2,3,4},2));
    }
}
