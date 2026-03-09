package DaySix;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int solution(int []a,int k){
        int len=a.length;
        if(k>=len) return -1;
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>(Collections.reverseOrder());

        for(int i:a){
            priorityQueue.add(i);
        }

        while (k>1 ){
            priorityQueue.poll();
            k--;
        }

        return priorityQueue.poll();
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,1,5,6,4},2));
        System.out.println(solution(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
