public class IterativeDemo {
    public static void main(String[]args){
        /*for(int c = 1; c <= 10; c++){
            if(c==5){
                break;
            }
            System.out.println(c);
        }*/

        int i = 1;
        while(i <= 10){
            if(i==5){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
