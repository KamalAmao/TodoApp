public class SelectiveCSDemo3{
    public static void main(String[]args){
        int requiredNumberOfTrip = 200;
        int numberOfTripDone = 100;
        int tripLeft = requiredNumberOfTrip - numberOfTripDone;
if(tripLeft >= requiredNumberOfTrip){
    System.out.println("Eligible");
}else if(tripLeft == 100){
    //System.out.println("You are not Eligible because you still have a total trip of " +tripLeft+ " to complete");
    System.out.println("You are Eligible on festive bonus");
}
    }
}