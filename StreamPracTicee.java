import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;
public class StreamPracTicee {
    public static void main(String[]args){
        int [] num = {2,4,6,8,10};
        int max = Arrays.stream(num).max().getAsInt();
        int secMax = Arrays
                        .stream(num)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .get();
        System.out.println(max);
        System.out.println(secMax);
        // Arrays.sort(num);
        // System.out.println(num[num.length -2]);
        

    }
}
