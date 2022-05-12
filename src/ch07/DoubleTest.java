package ch07;

import java.math.BigDecimal;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//지수부와 가수부를 분리?.
		
		int inum = (int) dnum;
		System.out.println("지수부는 : " + inum);
		System.out.println("가수부는 : " + (dnum - inum));
		// 가수부의 오차 발생
		//부동소수점 오류로 인해 정확한 값이 출력되지 않는다.
		
		//부동 소수점 표현의 오차를 해결하기 위해서는 BigDecimal 클래스 사용
		BigDecimal value0 = new BigDecimal(Integer.toString(inum));
		//int를 String으로 변환하여 value0에 대입
		BigDecimal value = new BigDecimal(String.valueOf(dnum));
		//double을 String으로 변환하여 value에 대입
		System.out.println("--------BigDecimal 사용--------");
		System.out.println("지수부는 : " + value0);
		// BigDecimal 간의 연산은 .subtract나 .add 등 사용
		System.out.println("가수부는 : " + value.subtract(value0));
	

		
	}
}
