package week2;

public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }


    public void deposit(int amount){
        if(amount>0) {
            this.balance += amount;
            System.out.println("입금 완료");
        }
        else System.out.println("금액 오류");
    }
    public void withdraw(int amount){
        if(amount>0 && this.balance>=amount){
            this.balance -= amount;
            System.out.println("출금 완료");
        }else System.out.println("잔액 부족");
    }

    public int getBalance(){
        return this.balance;
    }

    public String getOwnerName(){
        return this.ownerName;
    }
}
