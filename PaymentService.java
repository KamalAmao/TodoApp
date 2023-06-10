public class PaymentService implements KamalPayment {

    @override
    public void payWithCard(){
      String txDate =  KamalPayment.getPaymentDate("YY-MM-DD");
    }
   
    @override
    public double getBalance(){
        return KamalPayment.super.getBalance();
    }
}
