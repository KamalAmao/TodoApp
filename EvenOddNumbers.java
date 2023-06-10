public class EvenOddNumbers {
    public static void main(String[]args){
        int [] evenOdd = {20,21,22,23,24,25,26,27,28};
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i<evenOdd.length; i++){
            if(evenOdd[i] % 2 == 0){
                 evenCount++;
            } else if(evenOdd[i] % 2 == 1){
                oddCount++;
            }
        }
        System.out.println("even is " + evenCount+ "odd is " + oddCount);
    }
}
