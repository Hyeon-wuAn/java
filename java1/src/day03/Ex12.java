package day03;

public class Ex12 {
	public static void main(String[] args) {
		//for문 속 for문 2개
		int a;
		for(a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) {
				System.out.println(a+" "+b);
			}// b 종료
			for(int c=1; c<=5; c++) {
				System.out.println(a+" "
						+" hello");
			}// c 종료 후 a증감식으로 간다
		}
		
		int x;
		for(x=1; x<=3; x++) {
			for(int y=1; y<=3; y++) {
				System.out.println(x+" "+y);
			}
			for(int y=1; y<=3; y++) { //선언 영역이 다르기 때문에 y 중복 사용 가능
				System.out.println(x+" "+y);
			}
		}
		
		int w,z;   // 타입이 같기때문에 한번에 선언 가능
		for(w=1; w<=3; w++) {
			for(z=1; z<=3; z++) {
				System.out.println(w+" "+z);
			}
			for(z=1; z<=3; z++) { // for문 영역이 다름
				System.out.println(w+" "+z);
			}
		}
		
		
		
	}
}
