package Recurssions;

public class StringReverse {

    public static String solution(String s){

        if(s.length()==0) return "";
//        int edge=-2147483649;

        return s.charAt(s.length()-1)+ solution(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(solution("Madhu Sanduri"));
        System.out.println(solution("Hello World"));
    }
}
