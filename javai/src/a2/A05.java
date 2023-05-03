package a2;

public class A05 {
	public static void main(String[] args) {
		//50~100까지 홀수의 합 깔끔하게
		int sum = 0;
		for(int i=51; i<=60; i+=2) {
			sum+=i;
			System.out.print(i);
			if(i<59) {
				System.out.print("+");
			}else {System.out.print("=");
			System.out.print(sum);
			}
		}
		
		
		
	}
}
