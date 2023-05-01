package test;

public class Test11 {
	public static void main(String[] args) {
//		int a,b;
//		for (a=0; a<=4; a++) {
//			for(b=0; b<=4; b++) {
//				System.out.print(" ");
//			}
//			for(b=9; b>=9-a*2; b++) {
//				System.out.print("*");
//			}
//			System.out.println();		
//		}
		
		int a,b;
		for(a=0; a<=4; a++) {
			for(b=0; b<a; b++) {
				System.out.print(" ");
			}
			for(b=0; b<9-a*2; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
