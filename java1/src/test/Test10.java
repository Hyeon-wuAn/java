package test;

public class Test10 {
	public static void main(String[] args) {
		int a,b;
		for(a=0; a<=4; a++) {
			for(b=1; b<=4-a; b++) {
				System.out.print(" ");
			}
			for(b=0; b<a*2+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
