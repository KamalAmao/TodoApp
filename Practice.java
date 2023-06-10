public class Practice{
    public static void main(String[]args){
        int [] age = {30, 10, 15, 40, 20};
        int result = age[2] + age[4];
        int results = age[3];
       
        int requiredNumberOfTrip = 400;
        int tripMade = 200;
        float tripLeft = (float)requiredNumberOfTrip - (float)tripMade; 
       
        int rqdNumberOfTurn = 10;
        int turnCompleted = 6;
        int turnLeft = rqdNumberOfTurn - turnCompleted;
        if(turnLeft >= rqdNumberOfTurn){
            //System.out.println("Eligible");
        }else {
            //System.out.println("You have " +turnLeft+ " turns to complete");
        }

        if(tripLeft >= requiredNumberOfTrip){
            System.out.println("Qualify");
        }else {
            System.out.println(tripLeft);
        }
        /*System.out.println("The sum of age in index 2 and 4 is " +result);
        System.out.println("The value in index 3 is " +age[3]);
        System.out.println("Number of trip left is " +tripLeft);*/
    }

}