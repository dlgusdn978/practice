package week2;

public class PayMain {
    public static void main(String[] args){
        Payment[] pay = new Payment[2];
        pay[0] = new CreditCard();
        pay[1] = new KakaoPay();

        for(Payment p : pay){
            p.pay(10000);
        }
    }
}
