package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		// for( 초기식; 조건식; 증감식 ){실행코드}
		// 실행순서 : 초기식 -> 조건식(t) -> 실행코드 -> 증감식 -> 조건식 -> 실행코드 -> 증감식 -> 조건식 -> 실행코드..
		// 초기식 : 처음 단 한번만 실행
		// 조건식 : 조건식의 결과가 true일때 실행문 실행, 몇번 반복하는지 알 수 있다.
		// 증감식 : 증감함. 대입연산자가 주로 사용된다.
		// 조건식이 false 일때 for문 종료.
		
//		for(int a=1; 3>=a; a=a+2) { // 여기선 a++, ++a 상관없음
////	  ->for(int a=1; a=<3; a+=2) 이렇게도 쓸 수 있음. 	
//			System.out.println("안녕하세요");
//		}
//		
//		//0~5까지 출력하는 코드
//		for(int b=0; b<=5; b++) {
//			System.out.println(b);
//		}
//		
		//1~100까지 출력하는 코드
		for(int c=1; c<=100; c++) {
			System.out.println(c);
		}
		
		// for문에서 초기식과 증감식이 없어도 오류없이 존재는 가능함
		// ex) 밑과 같다(하지만 그렇게 사용할일 없다고 볼 수 있음)
		int d=1;
		for(; d<10; ) {
			System.out.println(d);
		}
		
		
	}
}
