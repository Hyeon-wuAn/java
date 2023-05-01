package ch03;

public class ForEx04 {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum +1;  // sum+=1
		sum = sum +2;  // sum+=2
		sum = sum +3;  // sum+=3
		sum = sum +4;  // sum+=4 
		sum = sum +5;  // sum+=5
		System.out.println("0~5까지의 합 : "+sum);
		
		System.out.println("-----------------------");
		
		//0~5까지의 합
		int sum1 = 0;
		for(int i =1; i<=5; i++) {
			sum1 += i; // i가 5가될때까지 ++때문에 1씩 더해짐.
		}
		System.out.println(sum1);
		System.out.println("-----------------------");
		int sum2 = 1;
		int a;
		for(a=2; a<=5; a++) {
			sum2+=a;
		}
		System.out.println(sum2);
		
		// 1~100까지의 합
		
		int x=0;
		for(int y=1; y<=100; y++) {
			x+=y;
		}
		System.out.println(x);
		
		
		
		
	}
}
