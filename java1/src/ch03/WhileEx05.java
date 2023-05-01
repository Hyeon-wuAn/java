package ch03;

public class WhileEx05 {
	public static void main(String[] args) {
		//1부터 100까지 출력
		int a =1;
		while (a<=100){
			System.out.println(a);
			a++;
		}
		
		System.out.println("--------------------");
		
	    //1부터 100까지 홀수 출력
		int c = 1;
		while (c<=100){
			System.out.println(c);
			c+=2;
		}
		
		System.out.println("--------------------");
		
		//1부터 100까지 짝수 출력
		int b =2;
		while (b<=100){
			System.out.println(b);
			b+=2;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}
}
