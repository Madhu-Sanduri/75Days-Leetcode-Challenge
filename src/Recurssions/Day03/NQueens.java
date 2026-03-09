package Recurssions.Day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static List<List<String>> solution(int N){
        List<List<String>> finalList = new ArrayList<>();
        char [][]c =new char[N][N];
        for(char[] i:c){
            Arrays.fill(i,'.');
        }
        int []left=new int[N];
        int []upDia=new int[2*N-1];
        int []lowDia=new int[2*N-1];
        backtracking(finalList,c,0,N,left,upDia,lowDia);
        return finalList;
    }

    static void backtracking(List<List<String>> list,char [][]c,int idx,int n,int []left,int []upDia,int []lowDia){

        if(idx==n){
            List<String> list1 =new ArrayList<>();
            for(int i=0;i<n;i++){
                list1.add(new String(c[i]));
            }
            list.add(new ArrayList<>(list1));
            return;
        }

        for(int i=0;i<n;i++){

            if(left[i]==0 && lowDia[i+idx]==0 && upDia[n-1+idx-i]==0){
                c[i][idx]='Q';

                left[i]=1;
                lowDia[i+idx]=1;
                upDia[n-1+idx-i]=1;
                backtracking(list,c,idx+1,n,left,upDia,lowDia);
                c[i][idx]='.';

                left[i]=0;
                lowDia[i+idx]=0;
                upDia[n-1+idx-i]=0;

            }
        }

    }


    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}
