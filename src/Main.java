//.
public class Main {
    public static int solution(int a){
        try {
            return -1;
        }
        catch (Exception e){
            System.out.println("Catch Block");
            return 10;
        }
        finally {
            System.out.println("Finally Bloack");
            return 2000;
        }
    }



    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    static {
        System.out.println("Madhu");
    }
    static {
        System.out.println("Madhu Second");
    }
}