import java.util.Scanner;
public class MassOfAir {
    public static void main(String[]args){
        /*pv = (0.5t + 460)/m
        p = pressure;
        v = volume;
        t = temparature;
        m = mass*/
        Scanner x = new Scanner(System.in);
        System.out.println("kindly provide the value of pressure");
        double pre = x.nextDouble();
        
        System.out.println("kindly provide the value of volume");
        double vol = x.nextDouble();
        
        System.out.println("kindly provide the value of temparature");
        double temp = x.nextDouble();

        /*System.out.println("kindly provide the value of mass");
        double mass = x.nextDouble();*/

        double pv = pre * vol;
        //System.out.println(pv);
        //m = (0.5t + 460)/pv

        double mass =((0.5*temp) + 460)/pv;
        System.out.println("The mass of air in an automobile tyre is " +mass);
    }
}
