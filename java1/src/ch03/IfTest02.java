package ch03;

public class IfTest02 {
	public static void main(String[] args) {
		int kor = 93;
		int eng = 90;
		int mat = 85;
		int sum = (kor+eng+mat);
		int aver = ((kor+eng+mat)/3);
		String grade;
		
		if (aver>=90 && aver<=100) {
			grade = "A";
		}else if (aver>=80 && aver<90) {
			grade = "B";
		}else if (aver>=70 && aver<80) {
			grade = "C";
		}else if (aver>=60 && aver<70) {
			grade = "D";
		}else {
			grade = "F";
		}
		if (sum>=250) {
			System.out.println("국어 점수는 "+kor+"점입니다.");
			System.out.println("영어 점수는 "+eng+"점입니다.");
			System.out.println("수학 점수는 "+mat+"점입니다.");
			System.out.println("총점은 " + sum + "입니다.");
			System.out.println("평균은 "+aver + "입니다.");
			System.out.println("학점은 "+grade + "입니다");
		}
		
		String error;
		error = "잘못 입력하셨습니다.";
		if (kor >100 || eng>100 ) {
			System.out.println(error);
		} else if (mat > 100) {
			System.out.println(error);
		}
		
		
		
		
	}
}
