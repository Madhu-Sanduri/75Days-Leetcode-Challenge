package Recurssions.Day2;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> solution(String s){
        List<String> list=new ArrayList<>();
        backtracking(s,0,new StringBuilder(),list);

        return list;
    }

    static void backtracking(String s,int idx,StringBuilder sb,List<String> tempList){
        if(sb.length()==s.length()){
            tempList.add(sb.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))>=0) continue;
            sb.append(s.charAt(i));
            backtracking(s,0,sb,tempList);
            sb.deleteCharAt(sb.length()-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(solution("abc")); //[abc, acb, bac, bca, cab, cba]
        System.out.println(solution("abcd"));
    }
}
