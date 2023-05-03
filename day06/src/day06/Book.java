package day06;

public class Book {
	// 제목,작자
	public String title;	
	public String author;
		//생성자가 하나라도 있으면 빈생성자도 같이 하나가 있어야함.
	public Book() {   // public class 와 같은 이름 사용. 밑처럼 아무것도 없는(매개변수없는) 생성자라도 만들어줘야함.
		this("untitled","nonamed");  // this 는 함수로도 호출해서 쓸 수 있다.
	}
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("제목 : "+title+", 작가는 "+author);
	}
}
