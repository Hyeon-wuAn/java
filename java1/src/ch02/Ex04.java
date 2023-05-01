package ch02;

public class Ex04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		// 출력, 증감연산자, 덧셈
		// 순서 : 증감 -> 덧셈 -> 출력
	//	System.out.println(++a + b);	// 11 + 10
	//	System.out.println(++a + ++b);  // 11 + 11
		
//		System.out.println(a++ + b++);  // 10 + 10 (후증가는 출력에 의미없음)
		
//		System.out.println(++a + ++a);  // 11 + 12 (a 먼저두번 증감)
		System.out.println(a++ + a++);  // 10 + 11 (앞에 a++ 연산 끝나고(a+1) 뒤의 a++연산, 그리고 덧셈)
		System.out.println(a);
		// 하나의 변수에는 연산자 하나만 대기할 수 있다.
		
		
	}
}
