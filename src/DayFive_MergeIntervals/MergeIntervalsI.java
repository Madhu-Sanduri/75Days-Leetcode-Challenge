package DayFive_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsI {

    public static List<int[]> solution(int [][]a){

        Arrays.sort(a, (x,y) -> x[0]-y[0]);

        List<int []> listArray = new ArrayList<>();

        int min=a[0][0];
        int max=a[0][1];
        
        for(int i=1;i<a.length;i++){
            
            if(max>=a[i][0]){
                min=Math.min(min,a[i][0]);
                max=Math.max(max,a[i][1]);
            }
            else{
                listArray.add(new int[]{min,max});
                min=a[i][0];
                max=a[i][1];
            }
        }
        listArray.add(new int[]{min,max});
        for(int[] i:listArray){
            System.out.print(Arrays.toString(i)+" , ");
        }
        System.out.println();
        return listArray;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,3},{2,6},{8,10},{15,18}})); //[[1,6],[8,10],[15,18]]
        System.out.println(solution(new int[][]{{1,4},{4,5}}));
    }
}
