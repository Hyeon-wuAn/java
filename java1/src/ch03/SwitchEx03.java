package ch03;

public class SwitchEx03 {
	public static void main(String[] args) {
		int a = 8;
		switch (a) {
			case 10:
				System.out.println("10점");
			break;					// break; 를 만나면 switch 문 빠져나감.
// break;는 모든 조건문, 반복문(if문, for문, while문, Do-while문에도 사용이 된다.
									// case 종료.
			case 9:
				System.out.println("9점");
			break;					// case 마다 break; 사용 가능.	
			case 8:
				System.out.println("8점");
			break;	
			default :
				System.out.println("0점");
		}
		
	    char aa = 'A';
	    int b = aa;
	    System.out.println(b);
		
		
	}
}
