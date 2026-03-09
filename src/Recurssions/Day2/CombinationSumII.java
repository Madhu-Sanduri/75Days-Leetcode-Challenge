package Recurssions.Day2;

import java.util.*;

public class CombinationSumII {

    public static List<List<Integer>> solution(int []a,int target){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(a);
        backtracking(list,new ArrayList<>(),0,a,target);
        return list;
    }
    static void backtracking(List<List<Integer>> list, List<Integer> tempList, int idx, int []a, int target){

        if(target==0){
//            Collections.sort(tempList);
            if(!list.contains(tempList)) list.add(new ArrayList<>(tempList));
        }
        else if(target<0) return;
        else{
            for(int i=idx;i<a.length;i++){
                tempList.add(a[i]);
                backtracking(list,tempList,i+1,a,target-a[i]);
                tempList.removeLast();
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10,1,2,7,6,1,5},8));
        System.out.println(solution(new int[]{2,5,2,1,2},5));
    }
}
