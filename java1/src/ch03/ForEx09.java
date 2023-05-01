package ch03;

public class ForEx09 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <-> 조건문 속 반복문
		for(int a=1; a<+10; a++) { 
			// for문의 조건식이 true 일때 실행.
			if(a%2==0) {
				// if 문의 조건식이 true 일때 실행.
				System.out.println(a+" : 짝수");
			}else { // if 문의 조건식이 f 일때
				System.out.println(a+" : 홀수");
			} // if문 종료.
		} // for문 종료.
		
		
		
	}
}
