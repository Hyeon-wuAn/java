package ch03;

public class SwitchEx05 {
	public static void main(String[] args) {
		char grade = '0';
		switch(grade) {
			case 'A':	//A or a or 0 일 경우
			case 'a':
			case '0':	
				System.out.println("최고 등급입니다.");
			case 'B':	// B 이거나 b 인 경우 (case)
			case 'b':
				System.out.println("중간 등급입니다.");
			break;		// switch문 빠져나감
			default :	// 값이 없는 경우
				System.out.println("최저 등급입니다.");
		}
		
		
		
		
		
	}
}
