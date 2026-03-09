package DayTwo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static String solution(int []a,int target){
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(!hashMap.isEmpty() && hashMap.containsKey(target-a[i])){
                return Arrays.toString(new int[]{hashMap.get(target-a[i]),i});
            }
            hashMap.put(a[i],i);
        }

//        int sum=0;
//        int len=a.length;
//        for(int i=0;i<len-1;i++){
//            for(int j=i+1;j<len;j++){
//                if(a[i]+a[j]==target) return Arrays.toString(new int[]{i,j});
//            }
//        }
        return null;
    }
    public static void main(String[] args){
        System.out.println(solution(new int[]{2,7,11,15},9));
        System.out.println(solution(new int[]{3,2,4},6));
    }
}
