package day05;

import java.util.Scanner; // 내 프로젝트에 쓸 수 있도로 하는 명령어 import



// 대부분의 프로그래밍 언어들의 변수 scope는 block안에서 유효하다.
// 특정 언어들은 function scope를 가지기도 한다.
public class ScoreArray {
	//int num = 100; // 전역 변수(전 영역에서 사용가능한 변수
					 // 지역 변수(특정 영역안에서만 쓰이는 변수
	public static void main(String[] args) {
		//String course[]= {};  // 배열에 바로 값 넣어줄 때 기본 형태.

		String course [] = { "java", "html", "javascript", "spring", "oracle"};
		int score [] = {90, 95, 88, 92, 78};
		
		Scanner scanner = new Scanner(System.in);  // 첫번째 Scanner 에 ctrl+스페이스로 java.util 선택
												   // System.in -> 내 키보드를 통해 입력받겠다.
		while(true) {			// 계속해서 반복 입력할 수 있도록..
			System.out.println("과목이름을 입력해주세요. 점수를 알려드립니다.");
			String courseName = scanner.next();
			if(courseName.equals("exit")) break;   // 정수 비교할때는 ==, 문자형에서는 equals
												   // break; 만 써서 같은 줄에 짧게 붙이기도 함.
			int i=0;
			for(i=0; i<score.length; i++) {
				if(course[i].equals(courseName)) {
				System.out.println(courseName+"의 점수는 "+score[i]+"입니다.");
				break;
				}
			}
			// 여기다가 없는 과목 입력한 경우를 처리.
			//System.out.println(i);
			if(i==score.length) System.out.println("없는 과목입니다. 다시 입력해 주세요.");
			//한줄일때 {} 생략 가능.
		}
		System.out.println("끝났음");
	
		
		
		
		
	}
}
