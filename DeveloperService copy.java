import java.util.List;
import java.util.ArrayList;
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
        
      
        System.out.println(developers);
    }
}
