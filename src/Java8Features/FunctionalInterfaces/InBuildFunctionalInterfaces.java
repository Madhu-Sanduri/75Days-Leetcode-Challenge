package Java8Features.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InBuildFunctionalInterfaces {

    public void Pred(){
        Predicate<Integer> predicate= n -> n%2==0;
        System.out.println(predicate.test(10));
    }

    public void Func(){
        Function<String,Integer> function= s -> s.length();
        System.out.println(function.apply("Madhu"));
    }

    public void Cons(){
        Consumer<String> consumer= s -> System.out.println("String");
      consumer.accept("Madhu");
    }

    public static void main(String[] args) {
        InBuildFunctionalInterfaces inBuildFunctionalInterfaces =new InBuildFunctionalInterfaces();
        inBuildFunctionalInterfaces.Pred();
        inBuildFunctionalInterfaces.Func();
        inBuildFunctionalInterfaces.Cons();
    }
}
