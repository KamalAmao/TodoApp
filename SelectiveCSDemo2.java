public class SelectiveCSDemo2{
public static void main(String[]args){
int totalTrip = 50;
int tripLeft = 120 - totalTrip;
if(totalTrip >= 120){
    System.out.println("Eligible for bonus");
}else {
    System.out.println("You are not eligible because you still have a total trip of " +tripLeft+ " to complete");
}
}
}