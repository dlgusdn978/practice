package week2;

public class OOP {
    public static void main(String[] args){
        SmartPhone phoneA = new SmartPhone("Apple", "iPhone 15");
        SmartPhone phoneB = new SmartPhone("Samsung", "Galaxy 24", 1200000);


        phoneA.showDetails();
        phoneB.showDetails();

    }
}
