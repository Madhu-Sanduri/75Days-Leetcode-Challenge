package StackBasedProblems.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSpanner {
    List<Integer> list;
    public StackSpanner(){
        list=new ArrayList<>();
    }

    public int next(int price){
        if(list.isEmpty()){
            list.add(price);
            return 1;
        }
        else{

            for(int i=list.size()-1;i>=0;i--){
                if(list.get(i)>=price){
                    list.add(price);
                    int value=list.size()-i-1;
                    return value;
                }
            }
            list.add(price);

        }
        return list.size();
    }

    public static void main(String[] args) {
        StackSpanner stackSpanner=new StackSpanner();
        String []s ={"StockSpanner", "next", "next", "next", "next", "next", "next", "next"};
        int [][]values={{}, {1}, {2}, {3}, {4}, {5}, {6}, {7}};

        for(int i=0;i<s.length;i++){
            if(s[i].equalsIgnoreCase("next")){
                int value=stackSpanner.next(values[i][0]);
                System.out.print(value+", ");
            }
        }
    }
}
