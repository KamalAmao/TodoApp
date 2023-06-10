import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FeatureTest {
    public static void main(String [] args){
        // MyFunction myFunction = (i) -> System.out.println("executed");
        // MyFunction myFunction = (i) -> i*5;
        // System.out.println(myFunction.test(15));

        // MyFunction myFunction = (s1, s2) -> (s1 + " " +s2);
        // System.out.println(myFunction.testString("acb", "cde"));

        Function<Integer, String> funt = (t) -> "output" + t;
        System.out.println(funt.apply(90));
    }
}
