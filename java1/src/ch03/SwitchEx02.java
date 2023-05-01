package ch03;

public class SwitchEx02 {
	public static void main(String[] args) {
		int time = 10;
		switch(time) {		// 해당 케이스부터 모든 실행문을 실행.
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default :		// 정해진 위치 없음. 보통 맨 아래에 사용.
							// 하나만 있을 수 있음.
				System.out.println("외근을 나갑니다");
		}
		
		
		
	}
}
