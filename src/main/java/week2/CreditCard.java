package week2;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount){
        System.out.println(amount + "원을 신용카드로 결제합니다.");
    }
}
