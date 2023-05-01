package ch01;

public class Ex11 {
	public static void main(String[] args) {
		int a = 130;
		byte b = (byte)a;	// 오버플로우
		System.out.println(b);
		// 표현할 수 있는 범위를 넘어서 나타나는 현상.
		
//		float f = 5.7;
		// 아무것도 안쓴 5.7앞에는 기본형 double이 생략
		// ->double이 float 보다 큰 단위이므로 오류
		
		float f = 5.7F; // 5.7의 앞에 (float), 뒤에 f나 F를 붙여 해결가능.
		
		long c = 100000*100000L; // 똑같이 (long), L 을 통해 해결가능(l은 헷갈려서 관례적으로 사용X)
		System.out.println(c);
		
		
		
	}
}
