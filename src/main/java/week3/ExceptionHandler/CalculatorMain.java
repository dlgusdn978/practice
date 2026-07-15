package week3.ExceptionHandler;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.divide(10, 2);
        c.divide(10, 0);
    }
}
