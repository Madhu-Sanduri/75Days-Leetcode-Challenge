import java.util.Optional;

public class FindFirstRepeatingDigit {

    public static int solution(String s){

        Optional<Character> optionalS=s.chars()
                .mapToObj(c-> (char)c)
                .filter( x -> s.indexOf(x)!=s.lastIndexOf(x))
                .findFirst();

        return optionalS.isPresent() ? optionalS.get()-'0' : -1;
    }


    public static void main(String[] args) {
        System.out.println(solution("abcdyeuooc")); //3
        System.out.println(solution("123456325")); //3
    }
}
