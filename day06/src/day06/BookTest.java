package day06;

public class BookTest {
	public static void main(String[] args) {
		
		
		Book littlePrince = new Book("어린왕자","쌩땍쥐베리");
		littlePrince.showInfo();
				
		Book java = new Book("java 코딩");
		java.showInfo();
		
		Book untitle = new Book();
		untitle.showInfo();
		
		
		
		System.out.println("==================");
		
		int a = 10;
		int b = a;
		a=100;
		System.out.println(a+"==="+b);
		System.out.println(b);
		
		Book myBook = littlePrince;
		littlePrince.author="san theckjjiberry";
		myBook.author = "장성호";
		System.out.println(littlePrince.author);
		System.out.println(myBook.author);
		//위의 a,b와는 달리 객체는 다른 방식으로 동작한다.
		//객체는 집어넣을 게 많기 때문에 한번에 같이 바뀐다.
		
		int arr01[]= {1,2,3};
		int arr02[]= arr01;
		arr02[1] = 200;
		System.out.println(arr01[1]);
		// 기본타입이 아닌 변수들은 참조를 한다. 복사하지 않는다.
		//          ((복사하면 위의 a,b처럼 독립적인 값을 가짐)
	}
}
