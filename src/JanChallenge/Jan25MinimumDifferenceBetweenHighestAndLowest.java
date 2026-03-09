package JanChallenge;

import java.util.*;

public class Jan25MinimumDifferenceBetweenHighestAndLowest {
    public static int solution(int []a,int k){
        int len=a.length;
        if(len<=k || k==1) return 0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i<k;i++){
            min=Math.min(min, a[i+k-1]-a[i]);
        }
        return Math.abs(min);
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        for(int i:a) priorityQueue.add(i);
//
//        List<Integer> list=new ArrayList<>();
//        while (len-k<priorityQueue.size()){
//            int abs=Math.abs(priorityQueue.poll()-priorityQueue.peek());
//            list.add(abs);
//            min=Math.min(abs,min);
//        }
//        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 15, 67, 1, 10},3)); //1,5,10,15,67 => (1,5),(1,10)
        System.out.println(solution(new int[]{134,15,13,6,52,15,1,616,1,51,51,43,324,613,2,63,614,46,361,3,616,43,63,51,77,135,13,6,23,467,2,3},5));
        /*
        616,616,614,613,467
        *
        * */
        System.out.println(solution(new int[]{78345, 21904, 56432, 90128, 34781, 61209, 84501, 12987, 43098, 70834, 95210, 18456, 67231, 50987, 36109, 89430, 24718, 63590, 78102, 45981, 10345, 82491, 57630, 39872, 91028, 26543, 74209, 51876, 13498, 68901, 45762, 83210, 29670, 60149, 9783, 75430, 41287, 56910, 88345, 23091, 71562, 34890, 92701, 18560, 60437, 79128, 26904, 54872, 86019, 32187, 67345, 49520, 90218, 14670, 73809, 58743, 41029, 82176, 29408, 65930},
                29));
        System.out.println(solution(new int[]{9,4,1,7},2)); // 1,4,7,9 => 2
        System.out.println(solution(new int[]{90},1));
    }
}

/*

4,5,6,7,10,15, k=4

10,15==>5
10,7 ==>3
7,6 ==>1

* */