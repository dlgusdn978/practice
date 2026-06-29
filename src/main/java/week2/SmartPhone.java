package week2;

public class SmartPhone {
    private final String brand;
    private final String model;
    private final int price;

    public SmartPhone(String brand, String model){
        // 생성자 체이닝
        this(brand, model, 0);
    }

    public SmartPhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showDetails(){
        System.out.println("["+brand+"] "+model+ " - " + price +"원");
    }
}
