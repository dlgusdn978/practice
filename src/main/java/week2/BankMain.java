package week2;

public class BankMain {
    public static void main(String[] args){
        BankAccount lee = new BankAccount("111-111-111-111", "lee");

        lee.deposit(-5000);
        lee.deposit(10000);
        lee.withdraw(20000);
        lee.withdraw(3000);
        System.out.println("잔액 : "+lee.getBalance());

    }
}
