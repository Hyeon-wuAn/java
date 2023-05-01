package ch03;

public class IfEx07 {
	public static void main(String[] args) {
		
//		if(score>=90) {
//			System.out.println("A학점");
//		}else if(score>=80) {
//			System.out.println("B학점");
//		}else if(score>=70) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");
//		}
		int score=87;		// 타입이 같을때는 변수로 선언하는 것이 깔끔.
		String result;		// 반복되는 문장 여러번 사용할 필요 X
		if(score>=90) {
			result="A학점";
		}else if(score>=80) {
			result="B학점";
		}else if(score>=70) {
			result="C학점";
		}else {
			result="F학점";
		}
		System.out.println(result);
		// 
		
		
				
		
		
	}
}
