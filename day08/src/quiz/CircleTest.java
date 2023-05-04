package quiz;

class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}     Source -> override/implement methods
	
	public boolean equals(Object obj) {
		Circle circle = (Circle) obj;
		if(x==circle.x && y==circle.y) {
			return true; 
	    }
		return false;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle circle01 = new Circle(5,5,5);
		Circle circle02 = new Circle(5,5,10);
		System.out.println(circle01==circle02);
		System.out.println(circle01.equals(circle02));
		if(circle01.equals(circle02)) {
			System.out.println("좌표가 같습니다");
		}else {
			System.out.println("좌표가 다릅니다");
		}
	}
}
