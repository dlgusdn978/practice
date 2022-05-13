package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		// string으로 변환하여 '문자'출력
		System.out.println(Integer.toString(ch3));
		
		String ch4 = "123";
		System.out.println(Integer.parseInt(ch4));
	}
}
