import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPrac {
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ade");
        names.add("Kola");
        names.add("Zion");
        names.add("Tuminse");
        
        //names.add(2, "Mary");
        //Collections.sort(names);

        // ArrayList<String> cars = new ArrayList<>();

        // cars.add("Benz");
        // cars.add("Volvo");
        // cars.add("Toyota");
        // cars.add("Lexus");
        // //Collections.sort(cars);
        // names.addAll(cars);
        // names.removeAll(cars);
       
        //Iterate using Java 8 forEach and lambda
        // names.forEach(name -> {System.out.println(name);}); 
       
        // names.remove(0);
        // names.clear();
        //names.size();
        //names.set(0, "kunle");
        //String get = names.get(1);

        //Searching for elements in an ArrayList
        System.out.println(names.contains("kingsley")); // Check if an ArrayList contains a given element 
        System.out.println(names.indexOf("Zion")); 
        System.out.println(names.lastIndexOf("Kola")); // Find the index of the last occurrence of an element in an ArrayList
       
        //System.out.println(names);
        //System.out.println(names.get(names.size()-1));
        //System.out.println(names.get(1));
        //System.out.println(names);
        //System.out.println(names.size());
        // for(String i : names){
        //     System.out.println(i);
        // }
        
    }
}
