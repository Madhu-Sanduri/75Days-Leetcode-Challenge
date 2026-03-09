package DayFour;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingRepeatNumbers {
    public static String solution(int []a){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int len=a.length;
        int sum=0;
        for(int i:a){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
            sum+=i;
        }
        int duplicateValue=0;

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>1) duplicateValue=entry.getKey();
        }

        int sumOfNumber= (len*(len+1))/2;

        System.out.println(sum);
        System.out.println(sumOfNumber);

        return Arrays.toString(new int[]{duplicateValue, Math.abs(sum-duplicateValue-sumOfNumber)});
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 4, 3, 5, 5, 1}));
        System.out.println(solution(new int[]{5,4,2,4,1}));
    }
}
