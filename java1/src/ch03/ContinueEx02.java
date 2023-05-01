package ch03;

public class ContinueEx02 {
	public static void main(String[] args) {
		// 짝수만 출력
		for(int a =1; a<=10; a++) {
			if(a%2 !=0) {			//홀수
				continue;			//홀수 출력 안함.
			}
			System.out.print(a+" ");//짝수일 경우에만 실행됨
									//print 뒤에 ln 없어서 줄바꿈 실행 안함.
		}
		
		System.out.println("");
		System.out.println("---------------");
		
		
		//1~10 중에 홀수만 출력
		for(int b=1; b<=10; b++) {
			if(b%2==0) {
				continue;
			}
			if(b<9)System.out.print(b+",");
			if(b==9)System.out.print(b);
		}
			System.out.println(" 는 홀수다");
		
		
		
		
		
	}
}
