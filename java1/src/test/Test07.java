package test;

public class Test07 {
	public static void main(String[] args) {
		
		int a,b;
		for(a=0; a<=4; a++) {
			for(b=1; b<=a+0; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=5-a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
 System.out.println("--------------------------");
 
 
		int c,d;
		for(c=1; c<=5; c++) {
			for(d=1; d<=c-1; d++) {
				System.out.print(" ");
			}
			for(d=1; d<=6-c; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
