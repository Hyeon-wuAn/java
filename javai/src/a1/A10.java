package a1;

public class A10 {
	public static void main(String[] args) {
		//1~10 중에 홀수만 출력
		for(int b=1; b<=10; b++) {
			if(b%2==0) {
				continue;
			}
			if(b<9)System.out.print(b+",");
			if(b==9)System.out.print(b);
		}
			System.out.println(" 는 홀수다");
		
		
		//1~100중에 3으로 나눠서 1의 나머지를 가지는 수들.
		for(int a=1; a<=100; a++) {
			if(a%3==1) {
				System.out.println(a);
			}
		}
			
		//1~100중에 3으로 나눠서 1의 나머지를 가지는 수를 뺀 수들.
		for(int c=1; c<=100; c++) {
			if(c%3==1) {
				continue;
			} System.out.println(c);
		}
			
			
		
	}
}
