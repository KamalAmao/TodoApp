import java.util.Arrays;
public class ArrayExercise {
    public static void main(String[]args){
        int [] array = {40, 20, 21, 22, 23};

            Arrays.sort(array);
        System.out.println(array[array.length -2]);// second highest element
    }
}
