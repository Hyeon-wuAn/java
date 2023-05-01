package day03;

public class Ex06 {
	public static void main(String[] args) {
		int score = 80;
		String result;
		
		if(score >= 90) {
			if(score >=95) {
				result="A+";
			}else {
				result="A";
			}
		}else {
			result="그외";
		}
		System.out.println(result);
		//result 오류나는 이유는 바깥쪽 if문의 조건식의 결과가 false일때 result의 대입되는 값이 없기 때문이다.
		//변수는 초기화가 되어야 사용 가능 -> 변수에 처음으로 값 대입
		// ""; 공백도 문자.
		
	}
}
