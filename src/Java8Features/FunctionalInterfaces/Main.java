package Java8Features.FunctionalInterfaces;

public class Main {
    public static void main(String[] args) {
        Calculator calculator =(a,b) -> (a+b);
        System.out.println(calculator.add(12,78));
    }
}
