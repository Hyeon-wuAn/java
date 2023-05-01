package ch03;

public class SwitchEx01 {
	public static void main(String[] args) {
		// Switch문 - 변수의 값을 가지고 평가한다.
		// 결과값을 정수형(거의int) , String 타입으로 사용한다.
		// {} 블럭만 영역이다. // : ; -> 영역 아님
		int a = 10;
//		switch(a) {
//			case 50 :
//				System.out.println("50");
//			case 30 :
//				System.out.println("30");
//			case 10 :
//				System.out.println("10");
//		}
		
		// 변수를 사용한다는 것은 변수 안에 있는 값을 사용한다는 것이다.
		
//		int num = 6;
//		switch(num) {    // 해당 case 부터 밑에 있는 모든 실행문을 실행.
//			case 1 :
//				System.out.println(1);
//			case 2:
//				System.out.println(2);
//			case 3:						// num3이니까 여기서부터 끝까지 값 출력
//				System.out.println(3);				
//			case 4:
//				System.out.println(4);
//			default :
//				System.out.println(0);	// 만족되는 값이 없으면 default로 온다			
//		}
		
		int num = 4;
		switch(num) {    // 해당 case 부터 밑에 있는 모든 실행문을 실행.
			case 1 :
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:						// num3이니까 여기서부터 끝까지 값 출력
				System.out.println(3);	
			default :
				System.out.println(0);
				
			case 4:
				System.out.println(4);
	// 만족되는 값이 없으면 default로 온다			
		}
		
		
		
	}
}
