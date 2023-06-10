import java.util.Scanner;
public class MassOfAirr {
    public static void main(String[]args){
        /*pv = (0.5t +460)/m
        p = pressure;
        v = volume;
        t = temparature;
        m = mass;*/
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly provide the value of pressure");
        double pre = x.nextDouble();

        System.out.println("Kindly provide the value of volume");
        double vol = x.nextDouble();

        System.out.println("Kindly provide the value of temparature");
        double temp = x.nextDouble();

        double pv = pre*vol;
        double mass = ((0.5*temp) + 460)/pv;
        System.out.println("The mass of air in an automobile tyre is " +mass);

    }
}
