import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;
public interface KamalPayment {
    void payWithCard();
    default double getBalance(){
        return new Random.nextDouble();
    }
    static String getPaymentDate(String pattern){
        SimpleDateFormat smp = new SimpleDateFormat(pattern); //dd-MM-yyyy, MM-DD-YYYY
        return smp.format(new Date());
    }
}
