package Recurssions.Day2;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> solution(int []a, int target){
        List<List<Integer>> list=new ArrayList<>();
        backtracking(new ArrayList<>(),list,a,target,0);

        return list;
    }

    static void backtracking(List<Integer> tempList, List<List<Integer>> list,int []a,int target,int idx){
        if(target==0){
            list.add(new ArrayList<>(tempList));
//            return;
        }
        else if(target<0){
//            tempList.removeLast();
            return;
        }
        else{
            for(int i=idx;i<a.length;i++){
                tempList.add(a[i]);
                backtracking(tempList,list,a,target-a[i],i);
                tempList.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,6,7},7));
    }
}
