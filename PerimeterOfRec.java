
import java.util.Scanner;

public class PerimeterOfRec{
    public static void main(String[]args){
        //p = 2(L+B);
        Scanner x = new Scanner(System.in);
        System.out.println("kindly supply the value of Length and breadth");
        double len = x.nextDouble();
        double bre = x.nextDouble();

        double p = 2*(len+bre);
        System.out.println("The perimeter of rectangle is " +p );

    }
}
