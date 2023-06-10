
import java.util.Scanner;
public class NestLoopDemo {
    public static void main(String[] args) {
        /*
        write a java program that calculates gpa of students in a class of n
        no of course - 9
        course unit - 2

        student score - ranges[70-100...]
        total no of students = 200

        for(student in class){
            for(score in courses){

            }
            print student gpa;
        }

        student 1 - score in course 1
        student 1 - score in course 2
        student 1 - score in course 3

        student 2 - score in course 1
        student 2 - score in course 2
        student 2 - score in course 3


        write a java program to print multiplication table 3-5
         */

//        for(int a = 3; a <=5; a++){
//            for(int b = 1; b<=12; b++){
//                int c = a * b;
//                System.out.println(a + "*" + b + "=" + c);
//            }
//        }

        /*
         GPA -> total equivalent unit attained/ sum of registered unit.
         for three course, lets assume total unit is 6
         10 + 10 + 10 - 30/6 = 5.0;

         complete this code for CGPA
         */
//        int sum = 0, sumUnit = 0;
//        Scanner input = new Scanner(System.in);
//        for(int std = 1; std <=5; std++){
//            System.out.println("Welcome Student " + std);
//            for(int course = 1; course<=3; course++){
//                System.out.println("Kindly supply your score and unit in course " + course);
//                int score = input.nextInt();
//                int unit = input.nextInt();
//                sumUnit = sumUnit + unit;
//                if((score >= 70) && (score <= 100)){
//                    sum+= unit * 5;
//                } else if((score >= 60) && (score <= 69)){
//                    sum+= unit * 4;
//                }else if((score >= 50) && (score <= 59)){
//                    sum+= unit * 3;
//                }else if((score >= 45) && (score <= 49)){
//                    sum+= unit * 2;
//                }else{
//                    sum+= unit * 0;
//                }
//            }
//            System.out.println(sum + "and " + sumUnit);
//            double gpa = sum/sumUnit;
//            System.out.println("Your GPA is " + gpa);
//        }

        /*
            Single Dimensional Array [] - a single loop
            Multi Dimensional Array  [][] - nested loop

            int [] age = new int[3]
            int[][]matrix = new int[2][2] - row and column

         */


    }
}
