package Recurssions.Day2;

import java.util.ArrayList;
import java.util.List;

public class RestoringIPAddress {

    public static List<String> solution(String s){
        List<String> list = new ArrayList<>();
        backtracking(list,new ArrayList<>(),0,s);
        return list;
    }

    static void backtracking(List<String> list, List<String> tempList, int idx, String s){
       if(tempList.size()==4){
           if(idx==s.length()){
               list.add(String.join(".",tempList));
           }
           return;
       }
        else {
            for(int i=1;i<=3;i++){
                if(idx+i> s.length()) break;
                String part = s.substring(idx,idx+i);
                if((part.length()>1 && part.startsWith("0")) || Integer.parseInt(part)>255) continue;
                tempList.add(part);
                backtracking(list,tempList,idx+i,s);
                tempList.removeLast();
            }
        }

    }


    public static void main(String[] args) {
        System.out.println(solution("25525511135"));
        System.out.println(solution("0000"));
        System.out.println(solution("101023"));
    }
}
