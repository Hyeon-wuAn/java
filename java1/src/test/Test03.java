package test;

public class Test03 {
	public static void main(String[] args) {

		int a,b;
		for(a=0; a<=4; a++) {		// 5째줄까지의 반복
			for(b=1; b<=5-a; b++) { // 별의 갯수
				System.out.print("*");
			}		
			System.out.println();	// 줄바꿈
		}
		
		System.out.println("-------------------");
		
		int c;
		for(c=5; c>=1; c--) {
			System.out.println(c);
		}
		
		
		
		
		
		
	}
}
