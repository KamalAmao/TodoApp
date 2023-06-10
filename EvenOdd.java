public class EvenOdd {
    public int evenOdd(int [] number){
        for(i = 0; i <= number.lenght; i++){
            int evenCounter, oddCounter = 0;
            if(number[i] % 2 == 0){
                evenCounter++;
            }else if(number[i] % 2 == 1){
    
                oddCounter++;
            }
        }
        return evenOdd(number);
    }
    
}
