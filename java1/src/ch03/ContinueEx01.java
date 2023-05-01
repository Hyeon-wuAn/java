package ch03;

public class ContinueEx01 {
	public static void main(String[] args) {
		// Continue문
		// 반복문(for, while, do-while) 으로 다시 돌아가서 실행해라
		// 증감식, 조건식으로 바로 간다.
		// 반복을 종료하지 않고 계속 실행한다는 점이 break 와 차이
		int a;
		for(a=1; a<=10; a++) {
			if(a==3) {
				continue; // 밑의 실행문으로 안 가고 반복문(증감식)으로 돌아간다. 
			}
			System.out.println(a); // 조건식f 일때 a 출력하기 위한 실행식 위치
		}
		
		
		
		
	}
}
