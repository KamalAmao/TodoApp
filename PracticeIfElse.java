import java.util.Scanner;
public class PracticeIfElse {
    public String getDay(int day){
        String dayName = "";
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; 
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thursday");
                break; 
            case 5:
                System.out.println("Friday");
                break; 
            case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("Invalid input");
        }
        return dayName;
    }
    public int getLargestNumber(int a, int b, int c){
        int largest = 0;
        if((a>b) && (a>c)){
            System.out.println("The greatest is " +a);
        } else if ((b>a) && (b>c)){
            System.out.println("The greatest is " +b);
        } else {
            System.out.println("The greatest is " +c);
        }
        return largest;
    }
    public static void main(String[]args){
        PracticeIfElse prac = new PracticeIfElse();
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly supply number from 1-7 and i will tell you the name of the weekday");
        int day = input.nextInt();
        prac.getDay(day);
       
        System.out.println("Kindl supply the numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        prac.getLargestNumber(a, b, c);


        /*System.out.println("Kindl supply the numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if((a>b) && (a>c)){
            System.out.println("The greatest is " +a);
        } else if ((b>a) && (b>c)){
            System.out.println("The greatest is " +b);
        } else {
            System.out.println("The greatest is " +c);
        }

        /*if(a>b)
            if(a>c)
            System.out.println("The greatest is " +a);
        if (b>a)
            if(b>c)
            System.out.println("The greatest is " +b);
        if (c>a)
            if(c>b)
            System.out.println("The greatest is " +c);*/
        
       
        /*System.out.println("Kindly supply number from 1-7 and i will tell you the name of the weekday");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break; 
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thursday");
                break; 
            case 5:
                System.out.println("Friday");
                break; 
            case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("Invalid input");
        }*/
    }

}
