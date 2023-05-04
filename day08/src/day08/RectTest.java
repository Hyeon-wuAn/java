package day08;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect rect = (Rect) obj; // obj 를 rect로 다운캐스팅 형변환.
		if(width*height == rect.width*rect.height) {
			return true;
		}
		return false;
	}
	
}

public class RectTest {
	public static void main(String[] args) {
		Rect rect01 = new Rect(10,10);
		Rect rect02 = new Rect(50,2);
		System.out.println(rect01==rect02);
		System.out.println(rect01.equals(rect02));
	}
}
