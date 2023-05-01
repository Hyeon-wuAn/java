package day03;

public class Ex09 {
	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){
		// 조건식이 true일때 실행
		// }
		//초기식 : 처음 단 한번만 실행됨.
		//조건식의 결과가 true일때 실행부분 실행
		//증감식 : 증가한다. 대입연산자 주로 사용됨
		//조건식이 false일때 for문 종료.
		//실행순서 : 초기식 -> 조건식 -> 실행부분 -> 증감식 -> 조건식 -> 실행 -> 증감식 -> 조건식 ->
		

		
		
		int a;
		for(a=1; a<=3; a++) {
			System.out.println(a);
		} //for문 종료
		System.out.println("-----------");
		// 1 ~ 100 까지 출력
		for(a=1; a<=100; a++) {
			System.out.println(a);
		}
		
		//1~100 홀수 출력
		for(a=1; a<=100; a+=2) { //a = a+2 -> a+=2
			System.out.println(a);
		}
		System.out.println("------------");
		//1~100 짝수 출력
		for(a=2; a<=100; a+=2)
			System.out.println(a);
		
		
		
	}
}
