package day03;

public class Ex14 {
	public static void main(String[] args) {
		// 구구단
		// 몇단인지, 1~9 숫자
		// 몇단 -> dan / 숫자 -> num
		int dan, num;
		for(dan=2; dan<=9; dan++) {         // 2단~9단
			for(num=1; num<=9; num++) {     // 1~9
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
		
		
		
	}
}
