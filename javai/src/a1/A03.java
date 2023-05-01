package a1;

public class A03 {
	public static void main(String[] args) {
		String result;
		int score = 90;
		switch (score) {
			case 100:
				result = "A+";
			case 95: case 90:
				result = "A";
			case 85: case 80:
				result = "B";
			case 75: case 70:
				result = "C";
			default :
				result = "F";
		}
		System.out.println(result);
		
		
		// 오류(score에 뭘 넣어도 F만 나옴)의 이유.
		// 변수는 하나의 값을 가진다.
		// 변수에 여러번 대입은 가능. 이때 마지막에 대입된 하나의 값을 가진다.
		// SwitchEx02 같은 경우는 case마다 실행문이 있었으니,
		// (위에 이어서) 실행문이 괄호 밖에 하나만 있는 위의 케이스와는 다름.
		// -> result 밑에(다음에) break; 넣어줌으로써 해결 가능.
		
		
		
		
	}
}
