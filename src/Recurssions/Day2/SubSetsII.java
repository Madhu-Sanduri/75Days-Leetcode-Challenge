package Recurssions.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubSetsII {
    public static List<List<Integer>> solution(int []a){
        Set<List<Integer>> listSet = new HashSet<>();
        backtracking(new ArrayList<>(),a,listSet,0);

        List<List<Integer>> list=new ArrayList<>();

        for(List<Integer> I: listSet){
            list.add(new ArrayList<>(I));
        }
        return list;
    }

    public static void backtracking(List<Integer> list, int []a, Set<List<Integer>> listSet, int idx){

        listSet.add(new ArrayList<>(list));

        for(int i=idx;i<a.length;i++){
            list.add(a[i]);
            backtracking(list,a,listSet,i+1);
            list.removeLast();
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,2}));
        System.out.println(solution(new int[]{0}));
    }
}
