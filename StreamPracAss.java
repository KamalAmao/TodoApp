import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;

public class StreamPracAss {
   public static void main(String[]args){

//     int[]numbers = {5,9,11,2,8,21,1};
//     int maximunValue= Arrays.stream(numbers).max().getAsInt();

//     // int secondMaxValue = Arrays.stream(numbers).max().findFirst().getAsInt();
//     // System.out.println(secondMaxValue);
//     Integer secondMaxValue = Arrays.stream(numbers) 
//             .boxed() // convert to wrapper
//             .sorted(Comparator.reverseOrder())
//             .skip(1)
//             .findFirst()  
//             .get();
//     System.out.println(secondMaxValue);

    // int secondMaxValue = Arrays.stream(numbers.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    //         .entrySet().stream()
    //         .filter(x -> x.getValue() == 1)
    //         .findFirst().get().getKey();
    //         System.out.println(secondMaxValue);

    // Arrays.sort(numbers);
    // System.out.println(numbers[numbers.length-2]);
    String input = "ilovejboss";
    List<String> duplicateElement = Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(x->x.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
                        System.out.println(duplicateElement);

            List<StreamEmployee> employees = Stream.of(
                                       new StreamEmployee(1, "ola", "math", 20000),
                                       new StreamEmployee(2, "ade", "eng", 200000)
            ).collect(Collectors.toList()) ;
            System.out.println(employees);
         Map<String, List<StreamEmployee>> temp = employees.stream().collect(Collectors.groupingBy(StreamEmployee::getDept));
         System.out.println(temp);

   }
}
