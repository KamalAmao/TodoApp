public class Recursion {
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else {
            return 0;
        }
    }
    public static int fib(int k){
        if(k > 0){
            return (k-1) + (k-2); 
        }else {
            return 0;
        }
    }
    public static void main(String[]args){
        //Recursion sum = new Recursion();
        int result = sum(10);
        System.out.println(result);
        int results = fib(5);
        System.out.println(results);
    }
}
