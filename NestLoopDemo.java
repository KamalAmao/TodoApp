import java.util.Scanner;
public class NestLoopDemo {
    public static void main(String[]args){
        int totalSumOfUnits = 0, totalSumOfPoints = 0;
        Scanner input = new Scanner(System.in);
            for(int std = 1; std <= 5; std++){
                System.out.println("Welcome student" +std);
                for(int semester = 1; semester <=2; semester++){
                    System.out.println("This is semester " +semester);
                for(int course = 1; course <= 3; course++){
                    System.out.println("Kindly supply your score and unit in course" +course);
                    int score = input.nextInt();
                    int unit = input.nextInt();
                    totalSumOfUnits = totalSumOfUnits + unit;
    
                   if((score >= 70) && (score <= 100)){
                        totalSumOfPoints+= unit * 5;
                   } else if((score >= 60) && (score <= 69)){
                        totalSumOfPoints+= unit * 4;
                    }else if((score >= 50) && (score <= 59)){
                        totalSumOfPoints+= unit * 3;
                   }else if((score >= 45) && (score <= 49)){
                        totalSumOfPoints+= unit * 2;
                   }else{
                        totalSumOfPoints+= unit * 0;
                   }
             }
        }
        //System.out.println(totalSumOfPoints + "and " + totalSumOfUnits);
        double cgpa = totalSumOfPoints/totalSumOfUnits;
        System.out.println("Your cgpa is " + cgpa);
        }
        }
    }


/*
    *       units    mark    point   
    *        3        70      5       15
    *        3        60      4       12
    *        2        60      4       8
    *        3        75      5       15
    *        2        50      3       6
    *        2        55      3       6
    *        2        65      4       8

 * totalunit= 17            totalSumOfPoint = 70 firstSemCourse
 * 
 * gpa = totalSumOfPoint/totalunit; 70/17 = 4.1
 * 
 *cgpa = first semester total sumof point + second semester total sumof point divided by first and second semester totalsumofunit.
 */
