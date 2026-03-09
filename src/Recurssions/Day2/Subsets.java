package Recurssions.Day2;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> solution(int []a){
        List<List<Integer>> list=new ArrayList<>();
        backtracking(a,0,list,new ArrayList<>());

        return list;
    }

    static void backtracking(int []a,int idx,List<List<Integer>> list,List<Integer> tempList){

        list.add(new ArrayList<>(tempList));

        for(int i=idx;i<a.length;i++){
            tempList.add(a[i]);
            backtracking(a,i+1,list,tempList);
            tempList.removeLast();
        }

    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3})); //[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}
