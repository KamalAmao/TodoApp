public class PrintLargestNumberInArray {
    public static void main(String[]args){
        int [] number = {20,40,10,50,60,70,15};
        // int min = number[0]; 
        // int max = number[0]; 

        // for(int i = 0; i<number.length; i++){
        //     if(number[i]< min){
        //         min = number[i];
        //     }else if(number[i]>max){
        //         max = number[i];
        //     }
        // }
        // System.out.println("smallest " +min+ " largest " +max);

        int max = 0;
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i] > number[j]);
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
