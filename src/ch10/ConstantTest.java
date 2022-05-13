package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 10;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		//변하지 않는 값을 반복하여 사용할 때 의미있게 하기 위해 사용
		// 선언된 부분만 변경하면 되므로 여러부분 수정 필요 X
	}
}
