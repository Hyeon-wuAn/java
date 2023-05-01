package ch02;

public class Ex01 { // 연산자
	public static void main(String[] args) {
		// 증감 연산자 ( ++ , -- )
		// 1증가, 1감소 (boolean 타입은 사용 불가)
		int a = 10;
//		System.out.println(a); // ;이 붙으면 하나의 실행문 10
//						++a;   // 하나의 실행문 : 혼자있을때 증가한다. 11
//		System.out.println(a); // 11
//						a++;   // 마찬가지 12
//		System.out.println(a); // 12
		
		// 할일 두가지 : 연산, 출력
		// 증감연산자가 변수 뒤에 있을때 연산이 마지막에 일어남
		
		
		System.out.println(++a);   //11(연산, 출력) -> 선증가
		
		System.out.println(a);     //11(출력)
		
        System.out.println(a++);   //11(출력, 연산) -> 후증가
        System.out.println(a);     //12
		
		
		
		
	}
}
