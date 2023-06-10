import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ArrayListExercise {
    public static void main(String[]args){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        // colors.add(0, "Black");
        // colors.set(2, "Pink");

        List<String> colors2 = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        // colors.add(0, "Black");
        // colors.set(2, "Pink");

        List<String> colors3 = new ArrayList<>();
        for(String e : colors){
            colors3.add(colors2.contains(e) ? "Yes" : "No");
            System.out.println(colors3);
        }
        //List <String> subColor = colors.subList(0,2);
        // if(colors.contains("Red")){
        //     System.out.println("valid");
        // }else{
        //     System.out.println("invalid");
        // }
        //Collections.sort(colors);
        // Collections.shuffle(colors);
        //Collections.reverse(colors);
        // System.out.println(subColor);
        // for(String i : colors){
        //     System.out.println(i);
        // }
    }
}
