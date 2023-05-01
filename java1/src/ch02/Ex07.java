package ch02;

public class Ex07 {
	public static void main(String[] args) {
		// 논리 연산자 -> if문과 for문에 함께 쓰임.
		// ( &&, ||, ! ) 3가지
		// && (and)연산자 : 조건이 모두 true 일때 결과가 true
		// || (or) 연산자 : 조건이 하나라도 true 일때 결과가 true
		// !  (not)연산자 : 결과를 반대로
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(true || false || true);
//		System.out.println(false || false);
		
		// 비교연산자와 많이 사용됨.
		int a = 10;
		
		int b = 5;
		boolean result = a>0 && a>100;
		System.out.println(result);
		
		boolean result2 = (a>0) || a>100; 
		System.out.println(result2);
		System.out.println(!result2);
		// ! 결과를 반대로 보여줌. 변수의 값은 원래대로 유지.
		
		System.out.println(a>7 && b<=5);
		System.out.println( (a%3==2) || (b%2 != 1) ); 
	}
}
