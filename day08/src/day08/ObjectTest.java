package day08;

// inner class
class Point{
	private int x,y;
	public Point(int x, int y) {
		super();//상위에서 호출, 생략 가능.
		this.x = x;
		this.y = y;
	}

	
//	public String toString() {
//		return "Point("+x+","+y+")";		// 결과를 뱉어내야 하면 return, 상관없으면 void
//	}							// toString 은 오버라이드 해서 많이 사용.
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		Point point = new Point(10, 10);
//		타입   이름
		Point point02 = new Point(10, 10);
		point.setX(20);
		System.out.println(point.getX());
		System.out.println(point.getClass());
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point02.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
		
	}
}
