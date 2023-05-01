package ch03;

public class SwitchEx07 {
	public static void main(String[] args) {
//		int score;
//		String grade = "B";
//		switch (grade) {
//		 case "A":
//			 score=100;
//		 case "B":
//			 score=80;
//			 break;
//		 default:
//			 score=60;
//		}
//		System.out.println("score는 "+score);
		
		int score = 100;
		String grade = "";
		switch (score) {
		 case 100:
			 grade="A";
			 break;
		 case 80:
			 grade="B";	 
		 default:
			 grade="C";
			 break;
		 case 60:
			 grade="D";
		}
		System.out.println("grade는 "+grade);
		
		//변수는 하나의 값만을 가짐. and 마지막에 대입된 값만을 가진다.
		
		
	}
}
