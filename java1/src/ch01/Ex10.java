package ch01;

public class Ex10 {
	public static void main(String[] args) {
		// 큰타입 -> 작은타입 대입(변환) - 디모션, 다운캐스팅
		// 변환'하려는' == 대입'되는' 타입 명시
		
		int a = 97;
		char b = (char)a;
		System.out.println(a);
		System.out.println(b);
		
		// 실수 > 정수
		double x = 10.5;
		int y = (int)x;
		System.out.println(x);
		System.out.println(y); // 0.5 의 데이터 손실 발생
							   // 다시 double 타입으로 바꿔도 복구 X
		double z = (double)y;
		System.out.println(z);
		
		// 서로 다른 타입으로의 변환은 생략하지 말기
		// 변환(대입)하려는 쪽의 타입 명시하기
		
	}
}
