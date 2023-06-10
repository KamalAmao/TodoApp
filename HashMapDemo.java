import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class HashMapDemo {
    public static void main(String[]args){
        Map<String, Integer> numberMapping = new HashMap<>();
        Map<String, String> userCityMapping = new HashMap<>();
        Map<String, String> husbandWifeMapping = new HashMap<>();
        
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");
       
        Set<String> husbandWifeMappingKey = husbandWifeMapping.keySet();
        Collection<String> husbandWifeMappingValue = husbandWifeMapping.values();
        System.out.println(husbandWifeMappingKey);
        System.out.println(husbandWifeMappingValue);
        husbandWifeMapping.forEach((husband, wife) -> {System.out.println(husband +" "+ wife);}); // lambda for hashmap      

        // String husband = "Jack";
        // String remove = husbandWifeMapping.remove("Jack");
        // System.out.println(husbandWifeMapping);
        // System.out.println(husband + " and " +remove+ " got divorced");
        // System.out.println(husbandWifeMapping);
       
        // numberMapping.put("one", 1);
        // numberMapping.put("two", 2);
        // numberMapping.put("three", 3);
        // numberMapping.put("four", 4);
        //numberMapping.putIfAbsent("five", 5);
        
        //System.out.println(numberMapping);
        // System.out.println(numberMapping.isEmpty()); // Check if a HashMap is empty
        // System.out.println(numberMapping.size()); // Find the size of a HashMap
        // System.out.println(numberMapping.size());


        
        // userCityMapping.put("John", "New York");
        // userCityMapping.put("Rajeev", "Bengaluru");
        // userCityMapping.put("Steve", "London");

        // Check if a HashMap is empty
        // System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        // Check if a key exists in the HashMap
        // String user = "John";
        // if(userCityMapping.containsKey(user)){
        //     String city = userCityMapping.get(user);
        //     System.out.println(user +" has the value of "+ city);
        // }else{
        //     System.out.println("invalid");
        // }

        // Check if a value exists in a HashMap
        // if(userCityMapping.containsValue("London")){
        //     System.out.println("London is present in userCityMaping");
        // }else{
        //     System.out.println("invalid");
        // }

        //husbandWifeMapping.forEach((husband, wife) -> {System.out.println(husband +" "+ wife);}); // lambda for hashmap      


        
       
    }
}
