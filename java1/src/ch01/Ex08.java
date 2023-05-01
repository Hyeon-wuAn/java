package ch01;

public class Ex08 {
	public static void main(String [] args) {
		char c = 'A';
		// 한글자의 문자(키보드의 모든 문자)만 사용 가능.
		// 반드시 ''(작은따옴표)안에 사용.
		// 아스키코드표
		System.out.println(c);
		int a = c;
		System.out.println(a);
		// 'A' = 65
		
		char ㄱ = '0';
				int ㄴ = (int)ㄱ; 
		System.out.println(ㄴ);
	}
}
