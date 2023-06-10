import java.util.Arrays;
import java.util.HashSet;
public class ArrayDemo3{
    static void pairsOfElement(int[]array, int number){
        for(int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] + array[j] == number){
                    System.out.println(array[i] +" + " +array[j] +" = " +number);
                }
            }
        }
    }
    public static void main(String[]args){
        // pairsOfElement(new int [] {2,7,4,-5,11,5,20}, 15);
        // pairsOfElement(new int [] {14,-15,9,16,25,45,12,8}, 30);
      
            int [] age = {20, 30, 30, 50, 40, 20, 60};
        String [] arr1 = {"Benz", "Lexus", "Toyota", "Jeep", "Bentley"};
        String [] arr2 = {"C2", "C3", "C4", "Jeep", "Bentley","c44"};

        // System.out.println("Array 1:" +Arrays.toString(arr1));
        // System.out.println("Array 2 :" +Arrays.toString(arr2));

        //  HashSet<String> set = new HashSet<String>();

        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = 0; j < arr2.length; i++){
        //         if(arr1[i].equals(arr2[j])){
        //             set.add(arr1[i]);
        //         }
        //     }
        // }
        // System.out.println("common element :" +set);

        //find common element in an array
        // for(int i = 0; i < age.length; i++){
        //     for(int j = i+1; j < age.length; j++){
        //         if(age[i] == age[j] && i != j){
        //             System.out.println(age[j]);
        //         }
        //     }
        // }

        // remove a specific element from an array
        // System.out.println("Origial array " +Arrays.toString(age));
        // int removeIndex = 1; 
        // for(int i = removeIndex; i < age.length-1; i++){
        //     age[i] = age[i+1];
        // }
        // System.out.println("After removing second index" + Arrays.toString(age));
        //we cannot alter  the size of an array, after removal, the last and second last element in the array will exist twice

        //  copy an array 
        int [] age1 = {20, 30, 30, 50, 40, 20};
        int [] newAge = new int [5]; 
        System.out.println("Original array " +Arrays.toString(age1));
        for(int i = 0; i < age1.length; i++){
            newAge[i] = age[i];
            System.out.println(newAge);
        }
        System.out.println("New array " +Arrays.toString(newAge));
        
        //int result = age[1] + age[4];
        // float results = (float)age[0] + age[3];
        // String numberResult = String.valueOf(result);
        // //System.out.println("The sum of age at index 1 and 4 is " +result);
        // //System.out.println(results);
    }
}