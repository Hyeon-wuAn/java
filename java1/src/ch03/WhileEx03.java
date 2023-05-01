package ch03;

public class WhileEx03 {
	public static void main(String[] args) {
		// 구구단
		int dan, num;
		for(dan=2; dan<10; dan++) {
			for(num=1; num<10; num++) {
				System.out.println(dan+"X"+num+"="+(dan*num));
			}
		}
		
//		int a=2;
//		int b=1;
//		while (a<10) {
//			while (b<10) {
//				b++;
//				
//			}
//					a++;
//			System.out.println(a+"X"+b+"="+a*b);	
//		}   //내가 한거
		
		int a =2;
		while(a<=9) {
			int b=1; // 초기식의 위치는 반드시 같은 변수의 조건식의 위에!
					 // a,b 같은 라인에서 선언하면 b=10이 되고 실행될 수 없음
			         //						(b<=9)였으니까
			while(b<=9) {
				System.out.println(a+"X"+b+"="+a*b);
				b++;
			}
			a++;
		}
		
		
		
		
		
	}
}
