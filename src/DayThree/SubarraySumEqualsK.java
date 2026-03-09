package DayThree;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int solution(int []a,int k){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,1);
        int sum=0;
        int count=0;

        for(int i=0;i< a.length;i++){
            sum+=a[i];

            if(hashMap.containsKey(sum-k)){
               count+= hashMap.get(sum-k);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1},2));
        System.out.println(solution(new int[]{1,2,3},3));

        /*
        map => (0,0)

        sum=1;

        rq => 2-1 map lo ledhu

        so map=>(0,1),(1,1)

        sum=2;
        req=2-2=>0
        map lo undhi


        * */
    }
}
