package day06;

public class CircleTest {
	public static void main(String[] args) {

		// 비지니스 로직
		// f(x,y) = x*2+y+y;
		// f(3,2) = 10; // 입력값과 결과값이 있는게 함수.
		// sin(90) = 1;
		// sin(180 = 0;
		// 리모콘(11) = mbc
		// 리모콘(33) = ocn
		
		
		
		Circle gong = new Circle(30,"축구공");
		System.out.println(gong.name+"의 넓이는 "+gong.getArea()+"입니다.");
		
		//		Circle circle = new Circle();			//같은 폴더내에서 import 안해도 됨.
												//new 는 생성자 함수
//		circle.name="써클";
//		circle.radius=10;
//		circle.getArea();
//		System.out.println(circle.name+"의 넓이는 "+circle.getArea()+"입니다");
//		
//		Circle circloe02 = new Circle(17);
//		circle02.name="써클02";
		
		Circle pizza = new Circle();
		pizza.name = "도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다.");
		
		// 던킨도넛
		Circle donut = new Circle();
		donut.name = "던킨도넛";
		donut.radius = 10;
		System.out.println(donut.name+"의 넓이는 "+donut.getArea()+"입니다.");
	}
}
