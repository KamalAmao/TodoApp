import java.util.Scanner;
public class CalculateCgpaa {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int totalSumOfUnit = 0, totalSumOfPoint = 0;
        for(int std = 1; std <= 5; std++){
            System.out.println("welcome student" +std);
            for(int semester = 1; semester <= 2; semester++){
                System.out.println("This is semester" + semester);
                for(int course = 1; course <= 3; course++){
                    System.out.println("Kindly provide your score and unit in course" + course);
                    int score = input.nextInt();
                    int unit = input.nextInt();
                    totalSumOfUnit = totalSumOfUnit + unit;

                    if((score>=70) && (score <= 100)){
                        totalSumOfPoint+= unit * 5;
                    }else if((score>=60) && (score<=69)){
                        totalSumOfPoint+= unit * 4;
                    }else if((score>=50) && (score<=59)){
                        totalSumOfPoint+= unit * 3;
                    }else if((score>=45) && (score<=49)){
                        totalSumOfPoint+= unit * 2;
                    }else{
                        totalSumOfPoint+= unit * 0;
                    }
                }
            }
            double cgpa = totalSumOfPoint/totalSumOfUnit;
            System.out.println("your cgpa is" +cgpa);
        }
    }
}
