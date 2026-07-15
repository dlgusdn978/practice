package week3.ExceptionHandler;

public class Calculator {

    public void divide(int num1, int num2){
        try {
            int res = num1 / num2;
            System.out.println("결과: " + res);
        }catch(ArithmeticException e){
            System.out.println("에러 : 0으로 나눌 수 없습니다.");
        }finally{
            System.out.println("계산이 종료되었습니다.");
        }
    }
}
