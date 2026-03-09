package JanChallenge;

import java.util.ArrayList;
import java.util.List;

public class Jan22MinPairRemoval {

    public static int solution(int []a){
        int len=a.length;
        /*
        Converting Array to ArrayList
        * */

        List<Integer> list =new ArrayList<>();
        for(int i:a){
            list.add(i);
        }

        //Already Sorted Case
        if(isSorted(list)) return 0;

        while(!isSorted(list)){
            int idx=0;
            int minSum=Integer.MAX_VALUE;
            int minSumPosition=0;

            for(int i=idx;i<list.size()-1;i++){
                if(list.get(i)+list.get(i+1)<minSum){
                    minSum=list.get(i)+list.get(i+1);
                    minSumPosition=i;
                }
            }

            list.add(minSumPosition,minSum);
            list.remove(minSumPosition+1);
            list.remove(minSumPosition+1);

        }
        return len-list.size();
    }

    static boolean isSorted(List<Integer> list){

        for(int i=0;i<list.size()-1;i++){
            if(!(list.get(i)<=list.get(i+1))) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,2,3,1}));
        System.out.println(solution(new int[]{1,2,2}));
    }
}
