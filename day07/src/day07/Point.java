package day07;

public class Point {
	// 속성 (properties)
	private int x;
	private int y;
	
	// 행위(메서드)를 통해서 내부의 속성을 바꾸는게 좋다.
	
	// getter / setter // 위 메뉴 중 Source 를 통해 들어가 선택할 수 있음.
	// getter (읽기전용)
	
	// return 타입이 없을때 void
	public void set(int x, int y) { //private에 있는 x,y를 사용가능.
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() {
		System.out.println( "(" + x + "," + y + ")" );
	}
}
