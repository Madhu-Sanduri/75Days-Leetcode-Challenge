package DayFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3 {

    public static List<Integer> solution(int []a){
        List<Integer> list =new ArrayList<>();
        int len=a.length;

        int first=0,second=0;
        int voteFirst=0,voteSecond=0;

        for(int i=0;i<len;i++){

            if(a[i]==first){
                first=a[i];
                voteFirst++;
            }
            else if(a[i]==second){
                second=a[i];
                voteSecond++;
            }
            else if(voteFirst==0){
                first=a[i];
                voteFirst=1;
            }

            else if(voteSecond==0){
                second=a[i];
                voteSecond=1;
            }
            else{
                voteFirst--;
                voteSecond--;
            }
        }
        voteFirst=0;
        voteSecond=0;

        for(int i=0;i<len;i++){

            if(a[i]==first) voteFirst++;
            else if(a[i]==second) voteSecond++;
        }

        if(voteFirst>len/3) list.add(first);
        if(voteSecond>len/3) list.add(second);

        return list;





//        return list;
//        System.out.println(hashMap);
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2}));
        System.out.println(solution(new int[]{1,1,2}));
        System.out.println(solution(new int[]{1}));
        System.out.println(solution(new int[]{3,2,3}));
    }
}


/*HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i:a){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        int len=a.length;

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){

            if(entry.getValue()>=(len/3)) list.add(entry.getKey());
        }*/