package JavaStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static String solution(String s){

        return Arrays.stream(s.split("\\s+"))
//                .filter(x -> Boolean.parseBoolean(x.toLowerCase()))
                .distinct()
                .collect(Collectors.joining(" "))
                .toString();

    }

    public static void main(String[] args) {
        System.out.println(solution("Hi Java is simple When we code in Java"));
        System.out.println(solution("Hi hello Hi hi"));
    }
}
