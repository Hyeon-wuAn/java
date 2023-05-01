package a1;

public class A09 {
	public static void main(String[] args) {
		int score = 87;
		String result="";     // =""가 없으면 오류
		if(score>=90) {
			if(score>=95) {
				result="A+";
			}else {
				result="A";
			}
		}
		System.out.println(result);
	}
}
//String 타입은 "" 로도 선언할 수 있음. ex) String result="";