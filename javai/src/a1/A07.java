package a1;

public class A07 {
	public static void main(String[] args) {
		int a=0;
		switch (a) {
			case 1:
				System.out.println("그들은 ");
			case 2:
				System.out.println("무척 ");
			case 3:
				System.out.println("기쁠 것이다. ");
			case 4:
				System.out.println("10분 안에 ");
			default :
				System.out.println("아무것도 아니다. ");
		}
		
		String Rank;
		int power=100; 
		switch (power) {
			case 100:
				Rank = "S";
				break;
			case 95: case 90:
				Rank = "A";
				break;
			case 85: case 80:
				Rank = "B";
				break;
			case 75: case 70:
				Rank = "C";
				break;
			default:
				Rank = "F";
		} System.out.println(Rank);
		
		
		
	}
}
