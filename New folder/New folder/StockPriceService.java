
import java.util.Scanner;
public class StockPriceService {
    /*
        Brute Force approach
        Optimal Approach

        compare (by difference) the first element with the rest of the element
        get the maximum value out of the operation

        BIG O notation is a mathematical notation that describes the limiting behavior of a function
                        when the input tends towards infinity.
           Notation(verify the time and space complexity of application)

        ==>Time Complexity : an amount of time an algorithm takes to run as a function of the size of its input;
         - Constant time 0(1)
         - Linear time - a loop O(n) -
         - Quadratic time - nested loop O(n^2)
         - Logarithmic time - O(log n)

        ==>Space Complexity: an amount of memory an algorithm requires to run as a function of the size of its input;

     */
    public int getMaxProfit(int [] prices){
        int maxProfit = 0;

        // int [] price = {7, 1, 4, 5,..}
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                maxProfit = Math.max(maxProfit, prices[i] - prices[j]);
            }
        }
        return maxProfit;

    }
    public int getMaxProfit2(int [] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        /*
               Using this price {7, 1, 4, 5, 3, 5, 8, 9}
               when i = 0, 7 < 2b, minP = 7
               when i = 1, 1 < 7, minP = 1
               when i = 2, 4 < 1, maxP = 4 - 1 = 3
               when i = 3, 5 < 1, maxP = 5 - 1 = 4

         */

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        // nested loop : loop within a loop
        Scanner input = new Scanner(System.in);
        StockPriceService sp = new StockPriceService();
        int [] prices = new int[8];
        for(int i = 0; i < 8; i++){
            System.out.println("Kindly supply the price at index " + i);
            prices[i] = input.nextInt(); 
        }
        System.out.println(sp.getMaxProfit2(prices));
//        System.out.println(new int[] {7, 1, 4, 5, 3, 5, 8, 9});

    }
}
