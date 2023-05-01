package ch01;

public class Ex03 {
	public static void main(String[] args) {
		/*
    기본 데이터 타입 (8가지)
    
	정수형 - 기본 int
		byte  : -127~128
		char  : 한 글자의 문자
		short : 약 -32000 ~ 32000
		int    : 약 -21억 ~ 21억
		long  : 2의 63제곱-1 까지
	실수형 - 기본double
		float    : 약 소수점 7자리까지
		double : 약 소수점 16자리까지
	논리형
		boolean : true / false
		*/
		
		//정수형 int
		int a = 5;
		System.out.println(a);
		
		double b; //선언
		b = 5.5;  // 대입
		double c = 7.7; //선언,대입
		
		double d = 5; // 적어도 1개 이상의 소수점.
		System.out.println(d);
		System.out.println(b);
		System.out.println(c); // 출력문도 하나의 값만 사용 가능
		System.out.println(a+b);
		
		
		
	}
}
