import java.util.Scanner;
public class SuperMarketQueue {
    public int getTotalQueueTime(int [] customers, int n){
        int nextCustomer = 0; 
        int [] tills = new int[n]; // array of tills
        int totalTime = 0;

        while(nextCustomer < customers.length){
            //put each customers into the till and get minTillTime
            int minTillTime = Integer.MAX_VALUE;
            for(int i = 0; i < tills.length; i++){
                if(tills[i] == 0 && nextCustomer < customers.length){
                    tills[i] = customers[nextCustomer++];
                }
                minTillTime = Math.min(minTillTime, tills[i]);
            }
            //subtract the minTillTime from each till   
            for(int i = 0; i < tills.length; i++){
                tills[i] -= minTillTime; // (2 - 2, 3- 2: [0,1]) second (10 - 1) [9, 0]
            } 
            totalTime+= minTillTime;
        }
        int maxTillTime = Integer.MIN_VALUE;
        for(int i = 0; i < tills.length; i++){
            maxTillTime = Math.max(maxTillTime, tills[i]);
        }
        totalTime+=maxTillTime;
        return totalTime;
    }
    public static void main(String[]args){
        SuperMarketQueue superMarketQueue = new SuperMarketQueue();
        // Scanner input = new Scanner(System.in);
        // int [] customers = new int[3];
        // int [] tills = new int[1];
        // for(int i = 0; i < 3; i++){
        //     System.out.println("Kindly supply the price and till at index " + i);
        //     customers[i] = input.nextInt();
        //     tills[i] = input.nextInt();
        // }
        // System.out.println(superMarketQueue.getTotalQueueTime( new int [] {customers}, tills));
        System.out.println(superMarketQueue.getTotalQueueTime(new int [] {2,3,10}, 2));
    }
}
