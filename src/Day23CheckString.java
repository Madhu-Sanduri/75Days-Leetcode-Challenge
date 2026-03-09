import java.util.HashSet;
import java.util.Set;

public class Day23CheckString {

    public static boolean solution(String s,int k){
        Set<Integer> uniqueSet =new HashSet<>();

        for(int i=0;i<=s.length()-k;i++){
            uniqueSet.add(Integer.parseInt(String.valueOf(s.substring(i,i+k)),2));
            if(uniqueSet.size()==Math.pow(2,k)) return true;
        }
        System.out.println(uniqueSet);
        return false;
    }


    public static void main(String[] args) {
        System.out.println(solution("00000000001011100",3));
        System.out.println(solution("00110",2));
        System.out.println(solution("00110110",2));
        System.out.println(solution("0110",1));
        System.out.println(solution("0110",2));
    }
}
