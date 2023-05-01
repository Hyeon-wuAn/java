package test;

public class Test06 {
	public static void main(String[] args) {
		int a,b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=a+0; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
