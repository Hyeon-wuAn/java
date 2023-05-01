package ch02;

public class Ex02 {
	public static void main(String[] args) {
		// 증감연산자의 위치와 순서
		// 변수 앞일때 선증가 / 변수 뒤에 있을때 후증가
		int a = 10;
//		System.out.println(a++);  //10    
//		System.out.println(++a);  //12    
//		System.out.println(a++);  //12    
//		System.out.println(a++);  //13    
//		System.out.println(++a);  //15    
//							a++;  //16 
//		System.out.println(++a);  //17   
//		System.out.println(a);    //17
		
		System.out.println(a--);   // 10 9 출 연
		System.out.println(--a);   // 8  8 연 출
		System.out.println(a--);   // 8  7 출 연
		System.out.println(a--);   // 7  6 출 연
		System.out.println(--a);   // 5  5 연 출
							a--;   // 4 연
		System.out.println(--a);   // 3  3 연 출
		System.out.println(a);     // 3 출
		
	}
}
