package day08;

//Rect라는 class를 만든다. width, height equals의 조건을 면적이 같으면 같은 Rect로 인정한다.

//Rect rect 01 = new Rect(10,10);
//Rect rect 02 = new Rect(50,2);
//System.out.println(rect01.equals(rect02));

class Point02 {
	private int x,y;
	public Point02(int x, int y) { // Source -> Constructor using Fields
		super();
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point02 point = (Point02) obj;
		if(x==point.x && y==point.y) {
			return true; // 조건이 만족되고 return 을 만나면 그 다음은 실행되지 않음.
	    }
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		/*
		Point02 pointA = new Point02(10,10);
		Point02 pointB = new Point02(10,10);
		Point02 pointC = pointA;
		System.out.println(pointA==pointB); // new 를 통해 올리는 순간 별도 생성
		System.out.println(pointA==pointC);
		System.out.println(pointA.equals(pointB)); 
		System.out.println(pointA.equals(pointC));
		*/
		
		
	}
}
