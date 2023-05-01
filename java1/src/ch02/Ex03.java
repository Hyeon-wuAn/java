package ch02;

public class Ex03 {
	public static void main(String[] arg) {
		// 산술 연산자 ( + , - , * , / , % )
		int a = 10;
		double b = 5.5;
		System.out.println(a+b);
		
		// 변수를 활용하는 코드가 더 좋은 코드이다.
		int c = (int)(a+b);
		
		double d = (double)(a+b);
		System.out.println(d);
		
		/*
			나머지 연산 : 나누고 난 후 남는 값.
			10%2 = 0
			10%3 = 1
			10%4 = 2
			10%20 = 10
		*/
		int e = 10;
		System.out.println(e%2==0); // 짝수
		System.out.println(e%2==1); // 홀수
		
		
		
		
	}
}
