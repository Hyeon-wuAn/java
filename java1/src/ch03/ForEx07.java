package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		// for문 속 for문
		int a;
		for(a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) {
				System.out.println(a*b);
			}
		}
		// for문 구구단
		int dan, num;
		for(dan=2; dan<=9; dan++) {		// 2단~9단
			for(num=1; num<=9; num++) { // 1 ~ 9
				System.out.println(dan +"X"+ num+"="+dan*num);
							// () : 수학에서 연산 우선위 가장 높다.
			}
		}		
				
		
		
		
		
	}
}
