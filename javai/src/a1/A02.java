package a1;

public class A02 {
	public static void main(String[] args) {
	//if문 예 만들기	
		int power = 96;
		String rank;
		if (power>=90) {
			if(power>=95) {
				rank = "S";
			}else {
				rank = "A";
			}
		}else if (power >=80) {
			rank = "B";
		}else if (power >=70) {
			rank = "C";
		}else {
			rank = "D";
		}
		System.out.println(rank);
		
	//삼항연산자	
				
	int poweR = 71;
	String ranK = (poweR>=95)? "S":((poweR>=90)? "A" : (poweR>=80) ? "B":"C"); 
	System.out.println(ranK);
	
		
		
	}
}
