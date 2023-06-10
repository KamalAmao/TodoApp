public class SuperMarketQueue2 {
    public int getTotalQueueTime(int [] customers, int n){
        int nextCustomer = 0;
        int [] tills = new int[n];
        int totalTime = 0; 
        while(nextCustomer < customers.length){
            int minTillTime = Integer.MAX_VALUE;
            for(int i = 0; i < tills.length; i++){
                if(tills[i] == 0 && nextCustomer < customers.length){
                    tills[i] = customers[nextCustomer++];
                }
                minTillTime = Math.min(minTillTime,tills[i]);
            }
            for(int i = 0; i < tills.length; i++){
                tills[i] -= minTillTime; 
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
        SuperMarketQueue2 sq = new SuperMarketQueue2();
        System.out.println(sq.getTotalQueueTime(new int[] {2,3,10}, 2));
    }
}
