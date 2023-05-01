package ch03;

public class LabelEx01 {
	public static void main(String[] args) {
		int a,b;
		// label : 이름을 붙여준다.
		aa:for(a=1; a<=5; a++) { // aa라는 이름 붙여줌.
			for(b=1; b<=5; b++) {
				if(b==3) {
					break aa; // aa 전체를 중지.
				}
				System.out.println(a+"--"+b);
			}
		}
		
		
		
		
	}
}
