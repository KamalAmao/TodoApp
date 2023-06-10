public class Practice1 {
public static int sum(int k){
    if (k > 0){
        return k + sum(k-1);
    }else{
        return 0;
    }
}
    public static void main(String[]args){
        // Practice1 practice = new Practice1();
        // int result = practice.sum(10);
        // System.out.println(result);
        int result = sum(10);
        System.out.println(result);
        // public int reverseNumber(int number){
        //     boolean isNegative = false;
        //     if(number < 0){
        //         isNegative = true;
        //         number*= -1;
        //     }
        //     long reverse =0;
        //     while(number > 0){
        //         reverse = (reverse *10) + (number % 10);
        //         number/=10;
        //     }
        //     return isNegative ? (int) (-1 * reverse): (int) (reverse);
        // }
       
    
        // public static void main(String[]args){
        //     Practice1 practice = new Practice1();
        //     Scanner input = new Scanner(System.in);
        //     System.out.println("Please provide the numbers you want to reverse");
        //     int number = input.nextInt();
        //     int result = practice.reverseNumber(number);
        //     System.out.println("Your reverse is" +result);
        // }

    }
}
