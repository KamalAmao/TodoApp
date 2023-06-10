import java.util.Scanner;
public class SwitchCase {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
     System.out.println("Kindly supply a numeric value between 1 -12 and i will tell you the month ");
     int month = x.nextInt();
      
    switch(month){
        case 1:
            System.out.println("JANUARY");
            break;
        case 2:
            System.out.println("FEBRUARY");
            break;
        case 3:
            System.out.println("MARCH");
            break;
        default:
        System.out.println("This is an invalid month");
     }
    }
    