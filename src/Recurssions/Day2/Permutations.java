package Recurssions.Day2;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> solution(int []a){
        List<List<Integer>> list=new ArrayList<>();
        backtracking(a,0,list,new ArrayList<>());

        return list;
    }

    static void backtracking(int []a,int idx,List<List<Integer>> list,List<Integer> tempList){

        if(tempList.size()==a.length){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=0;i<a.length;i++){
            if(tempList.contains(a[i])) continue;
            tempList.add(a[i]);
            backtracking(a,i+1,list,tempList);
            tempList.removeLast();
        }

    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3})); //[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}
