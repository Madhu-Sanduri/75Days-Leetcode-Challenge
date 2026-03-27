package BinarySearch.Day06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PaintersPartitionProblem {

    public static int solution(ArrayList<Integer> list,int k){
        int len=list.size();
        int sum=list.stream().reduce(Integer::sum).get();
        Optional<Integer> max=list.stream().reduce(Integer::max);
        int value=binarySearch(list,k,max.get(),sum);

        return value;
    }

    static int binarySearch(ArrayList<Integer> list,int k,int s,int e){
        int min=Integer.MAX_VALUE;
        while (s<=e){
            int mid =s+(e-s)/2;
            int isValid=isValid(list,mid);
            if(isValid<=k) min=Math.min(mid,min);
            if(isValid<=k) e=mid-1;
            else s=mid+1;
        }
        return min;
    }
    //13
//6+12 => 18/2 =>9
    //10+12 => 22/2 =>11
    static int isValid(ArrayList<Integer> list,int mid){
        int painters=1;
        int boardsPainted=0;

        for(Integer i:list){
            if(i+boardsPainted<=mid){
                boardsPainted+=i;
            }
            else {
                painters++;
                boardsPainted=i;
            }
        }

        return painters;
    }


    public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(List.of(2, 1, 5, 6, 2, 3)),2));
        System.out.println(solution(new ArrayList<>(List.of(10,20,30,40)),2));
    }
}


/*
6+20/2 => 26/2 => 13

 *
 * */