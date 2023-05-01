package ch03;

public class IfTest {
	public static void main(String[] args) {
		// 1번
		int score = 93;
		String grade;
		if (score>=90) {
			grade = "A";
		}else if (score >=80) {
			grade = "B";
		}else if (score >=70) {
			grade = "C";
		}else if (score >=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("점수는 "+score+"점입니다.");
		System.out.println("학점은 "+grade+"입니다.");
		
		// 2번
		int 국어 = 93;
		int 영어 = 90;
		int 수학 = 85;
		
		
		
		
	}
}
