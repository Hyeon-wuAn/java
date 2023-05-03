package day06;

public class Circle {
	int radius;
	String name;
	
	// 과적하다. =오버로드(여러개 싣는거)
	public Circle() {    		//생성자 함수, 타입을 명시 하지 않음.
//		System.out.println("나는 circle");
	}
	public Circle(int r) {
//		System.out.println("나는 circle");
		radius = r;
	}
	public Circle(int r, String n) {
		radius =r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
