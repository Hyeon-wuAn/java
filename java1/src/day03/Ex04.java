package day03;

public class Ex04 {
	public static void main(String[] args) {
//		int score = 87;
//		String result;
//		if(score >= 90) {
//			System.out.println("A학점");
//		}else if(score >=80) {
//			System.out.println("B학점");
//		}else if(score >=70 ) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");
//		}
		
		int score = 87;
		String result;    // 타입이 같으면 변수로 선언하면 깔끔.
		                  // 출력문 여러번 사용할 필요 X
						  // 선언 먼저하고 밑에 조건에 따른 대입 할 수 있음
	
		if(score >= 90) {
			result="A학점";
		}else if(score >=80) {
			result="B학점";
		}else if(score >=70 ) {
			result="C학점";
		}else {
			result="F학점";
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
