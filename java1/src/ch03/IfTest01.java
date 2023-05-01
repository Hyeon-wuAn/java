package ch03;

public class IfTest01 {
	public static void main(String[] args) {
		int kor = 93;
		int eng = 90;
		int mat = 85;
		int sum = (kor+eng+mat);
		
		if (sum>=250) {
			System.out.println("국어 점수는 "+kor+"점입니다.");
			System.out.println("영어 점수는 "+eng+"점입니다.");
			System.out.println("수학 점수는 "+mat+"점입니다.");
			System.out.println("총점은 " + sum + "입니다");
		}else if(sum>=200) {
			System.out.println();
		}else {
			
		}
		
		
	}
}
