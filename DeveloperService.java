import java.util.List;
import java.util.stream.Collectors;

import javafx.beans.binding.StringBinding;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
public class DeveloperService {
    public static void main(String[]args){
        Developer d1 = new Developer();
        d1.setId(1);
        d1.setName("John");
        d1.addBook("Tango");
        d1.addBook("Java8");
        d1.addBook("Python");
         

        Developer d2 = new Developer();
        d2.setId(2);
        d2.setName("Mike");
        d2.addBook("Hurray");
        d2.addBook("Happy Day");
        d2.addBook("Tango");

        List<Developer> developers = new ArrayList<>();
        developers.add(d1);
        developers.add(d2);

        //System.out.println(developers);

        // Map<String, String> map = developers.stream()
        //                                     .collect(Collectors.toMap(Developer::getName, Developer::getBooks));
        // Map<Set<String>, List<Developer>> allBooks = developers.stream().collect(Collectors.groupingBy(Developer::getBooks));
        // System.out.println(allBooks);
        // List<Set<String>> dev = developers.stream()
        //                             //.map(developer -> developer.getBooks())
        //                             .map(Developer::getBooks)  
        //                             .collect(Collectors.toList())
        //                             .forEach(System.out::println);

            // developers.stream()
            //         //  .map(developer -> developer.getBooks())
            //             //.map(Developer::getBooks)
            //             .flatMap(x-> x.getBooks().stream())
            //         //  .collect(Collectors.toList())
            //             .forEach(System.out::println);     
                                    
            developers.stream()
                        .flatMap(x-> x.getBooks().stream())
                        .filter(x -> !x.contains("Python"))
                    //  .map(Developer::getBooks)
                    //  .collect(Collectors.toList())
                        .forEach(System.out::println);                            
       
    }
}