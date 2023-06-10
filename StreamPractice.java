import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class StreamPractice {
    public static void main(String[]args){

        // int [] numbers = {1, 2, 4, 5, 6, 7, 8};
        // int maxValue = Arrays.stream(numbers).max().getAsInt(); 
        //System.out.println(maxValue);
        
        // Arrays.stream(numbers).filter(num -> num%2 == 0).forEach(System.out::println);

        List<StreamEmployee> employees = Stream.of(
            new StreamEmployee(1,"kunle", "math", 20000),
            new StreamEmployee(2,"shike", "Eng", 200000),
            new StreamEmployee(3,"ade", "math", 20000)
        ).collect(Collectors.toList());
        // System.out.println(employees); //

        // Map<String, List<StreamEmployee>> temp = employees.stream().collect(Collectors.groupingBy(StreamEmployee::getDept));
        // //System.out.println(temp); //group by department

        // employees.stream()
        //         .filter(employee -> employee.getSalary() > 20000) // employee salary greater than
        //         .forEach(System.out::println);

        employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .map(employee -> employee.getName())
                .forEach(System.out::println);
                    //OR
        // employees.stream()
        //         .filter(employee -> employee.getSalary() >20000)
        //         .map(StreamEmployee::getName)
        //         .forEach(System.out::println);
    // employees.stream()
    //             .filter(employee -> employee.getDept() == "math")
    //             .map(StreamEmployee::getName)
    //             .forEach(System.out::println);

    String input = "ilovejboss";
    String [] result = input.split("");
    // System.out.println(Arrays.toString(result));
    //  Map<String, List<String>> map = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(s->s));
    //         System.out.println(map);

    // Map<String, Long> map = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    //         System.out.println(map);

    // Map<String, Long> map = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    //      List<String> duplicateElementKey = map.entrySet().stream()
    //                 .filter(x -> x.getValue() > 1)
    //                 .map(Map.Entry :: getKey)
    //                 .collect(Collectors.toList());
    //                 System.out.println(duplicateElementKey); // print keys of duplicate elements
    //             //OR
    //      List<String> result3 = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    //         .entrySet().stream()
    //         .filter(x->x.getValue() > 1)
    //         .map(Map.Entry::getKey)
    //         .collect(Collectors.toList());
    //         System.out.println(result3);

    // Map<String, Long> map = Arrays.stream(input.split(""))
    // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    // Map<String, Long> duplicateElementKeyValue = map.entrySet().stream()
    //         .filter(x -> x.getValue() > 1)
    //         .collect(Collectors.toMap(x ->x.getKey(), x->x.getValue()));
    //         System.out.println(duplicateElementKeyValue); // print  key and value

    // List<String> uniqueElement = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    //         .entrySet().stream()
    //         .filter(x -> x.getValue() == 1)
    //         .map(Map.Entry :: getKey)
    //         .collect(Collectors.toList());
    //         System.out.println(uniqueElement);

    // String firstNonRepeat = Arrays.stream(input.split(""))
    //         .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    //         .entrySet().stream()
    //         .filter(x -> x.getValue() ==1)
    //         .findFirst().get().getKey();
    //         System.out.println(firstNonRepeat);

    //  String firstRepeat = Arrays.stream(input.split(""))
    //             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    //             .entrySet().stream()
    //             .filter(x->x.getValue() > 1)
    //             .findFirst().get().getKey();

    
    //         System.out.println(firstRepeat);

        // Map<String, Long> map = Arrays.stream(input.split(""))
        //             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            
        //         Map<String, Long> duplicateKeyValue = map.entrySet().stream()
        //             .filter(x -> x.getValue()  >1)
        //             .collect(Collectors.toMap(x ->x.getKey(), x->x.getValue()));
        //             System.out.println(duplicateKeyValue);


    }
}
