package week2;

public class KakaoPay implements Payment{
    @Override
    public void pay(int amount){
        System.out.println(amount + "원을 카카오페이로 결제합니다.");
    }
}
