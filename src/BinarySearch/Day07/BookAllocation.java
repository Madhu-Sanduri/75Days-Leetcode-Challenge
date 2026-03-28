package BinarySearch.Day07;

import java.util.ArrayList;
import java.util.List;

public class BookAllocation {
    public static int solution(List<Integer> list,int m){
        int len=list.size();
        int max=list.stream().reduce(Integer::max).get();
        int sum=list.stream().reduce(Integer::sum).get();

        int value=binarySearch(max,sum,list,m);
        return value>max?value:-1;
    }

    static int binarySearch(int s,int e,List<Integer> list,int m){
        int min=Integer.MAX_VALUE;
        while (s<=e){
            int mid=s+(e-s)/2;
            int validCheck = isValid(list,mid);
            if(validCheck<=m) min=Math.min(mid,min);
            if(validCheck<=m) e=mid-1;
            else s=mid+1;
        }

        return min;
    }

    static int isValid(List<Integer> list,int mid){
        int count=1;
        int sum=0;
        for(int i:list){
            if(sum+i>mid){
                sum=i;
                count++;
            }
            else{
                sum+=i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(List.of(2, 8, 8, 4,5 )),6));
        System.out.println(solution(new ArrayList<>(List.of(12, 34, 67, 90)),2));
        System.out.println(solution(new ArrayList<>(List.of(25 ,46 ,28 ,49,24)),4));
    }
}
