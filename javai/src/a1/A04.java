package a1;

public class A04 {
	public static void main(String[] args) {
		for(int a=1; 3>=a; a=a+2) { // 여기선 a++, ++a 상관없음
//	  ->for(int a=1; a=<3; a+=2) 이렇게도 쓸 수 있음. 	
					System.out.println("안녕하세요");
				}
	}
}
