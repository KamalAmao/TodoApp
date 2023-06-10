import java.util.Scanner;
public class Sp {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //StockPriceService sp = new StockPriceService();
        int [] price = new int[8];
        for(int i = 0; i < 8; i++){
            System.out.println("Kindly supply the price at index " + i);
            price[i] = input.nextInt();
        }
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < price.length; i++){ 
            if(price[i] < minPrice){
                minPrice = price[i];
            }else if(price[i] - minPrice > maxProfit){
                maxProfit = price[i] - minPrice;
            }
        System.out.println(maxProfit);
    }
}

}
