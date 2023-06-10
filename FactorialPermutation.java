public class FactorialPermutation {
    public static void main(String[]args){
        int n = 1;
        for(int c = 1; c <= 10; c++){
            n = n*c;
        }
        System.out.println(n );

        int m = 1;
        for(int c =1; c<=5; c++){
            m = m*c;
        }
        System.out.println(m);

        int sum = n/m;
        System.out.println(sum);
    }
}
