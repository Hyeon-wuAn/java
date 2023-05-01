package ch02;

public class Ex09 {
	public static void main(String[] args) {
		// 대입 연산자
		// 변수의 값을 변경한다.
		// ( =, +=, -=, *=, /=, %= ) -> "=" 이 뒤에 있어야함.
		int a = 10;
		System.out.println(a+10);
		System.out.println(a);
		// 단순한 +라서 변수의 값 변함X
		System.out.println(a+=10);  // a = a+10 : 자기자신을 연산하고 대입
		System.out.println(a);
		// 대입연산자와 함께 사용 : 변수의 값이 변함.
		
		int x = 10;
		int y = ++x; // ++x 도 하나의 실행문(증감 먼저 대입 마지막)
		System.out.println(y);
		int z = ++y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
}
