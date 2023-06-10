import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[]args){
        // ArrayList<String> animals = new ArrayList<>();
        // animals.add("goat");
        // animals.add("dog");
        // animals.add("cat");
        // animals.add("pig");
        // System.out.println(animals);

        // animals.add(2, "elephant");
        // System.out.println(animals);
        
        // ArrayList<String> cars = new ArrayList<>();
        // cars.add("benz");
        // cars.add("toyota");

        // animals.addAll(cars);
        // System.out.println(animals);

        // ArrayList<String> topCompanies = new ArrayList<>();

        // // Check if an ArrayList is empty
        // System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        // topCompanies.add("Google");
        // topCompanies.add("Apple");
        // topCompanies.add("Microsoft");
        // topCompanies.add("Amazon");
        // topCompanies.add("Facebook");
        // System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        // System.out.println(topCompanies);

        // String bestCompany = topCompanies.get(0);
        // String secondBestCompany = topCompanies.get(1);
        
        // try{
        //     String lastCompany = topCompanies.get(topCompanies.size() - 0);
        //     System.out.println("Last Company in the list: " + lastCompany);
        // }catch (Exception e){
        //     System.out.println("oga check wetin you press" +e);
        // }


        // System.out.println("Best Company: " + bestCompany);
        // System.out.println("Second Best Company: " + secondBestCompany);
        // //System.out.println("Last Company in the list: " + lastCompany);

        // // Modify the element at a given index
        // topCompanies.set(4, "Walmart");
        // System.out.println("Modified top companies list: " + topCompanies);

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        ArrayList<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        // Remove all the elements that satisfy the given predicate
        // programmingLanguages.removeIf(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s) {
        //         return s.startsWith("C");
        //     }
        // });

        /*
            The above removeIf() call can also be written using lambda expression like this -
            programmingLanguages.removeIf(s -> s.startsWith("C"))
        */

        //System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
    
}
