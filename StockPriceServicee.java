import java.util.Scanner;
public class StockPriceServicee {
    public int getMaxProfit(int [] price){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < price.length; i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }else if(price[i] - minPrice > maxProfit){
                maxProfit = price[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[]args){
        StockPriceServicee goods = new StockPriceServicee();
        Scanner input = new Scanner(System.in);
        int [] price = new int [8];
        for(int i = 0; i < 8; i++){
            System.out.println("Kindly supply the price at index " +i);
            price[i] = input.nextInt();
        }
        System.out.println(goods.getMaxProfit(price));
    }
}