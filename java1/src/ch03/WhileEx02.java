package ch03;

public class WhileEx02 {
	public static void main(String[] args) {
		// while문에서 break 사용
		int a = 0;
		while(true) { // true는 일부러 무한반복 동작시킬 때 많이 쓰임.
			a++;
			System.out.println("hello");
			if(a==10) {
				break; // if문과 break 사용해서 while문 빠져나감.
			}
		}
		
		
		
		
	}
}
