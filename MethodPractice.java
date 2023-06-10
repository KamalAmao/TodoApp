import java.util.Scanner;
public class MethodPractice {
    /*public int checkAge(int age){
        if(age<18){
            System.out.println("Access denied");
        }else{
            System.out.println("Access granted");
        }
        return age;
        }*/
        public int myMethod(int x, int y){
            int z = x + y;
            return z;
        }
        public static void main(String[]args){
            MethodPractice ages = new MethodPractice();
            Scanner input = new Scanner(System.in);
            /*System.out.println("Kindly supply the age");
            int age = input.nextInt();
            int result = ages.checkAge(age);
            System.out.println(result);*/
            int x= 0; int y = 0;
            System.out.println("Kindly supply the value of x and y");
            int userInput = input.nextInt();
            int z = ages.myMethod(x,y);
            System.out.println(z);
        }
}
