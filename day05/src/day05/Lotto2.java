package day05;

public class Lotto2 {
	public static void main(String[] args) {
		int lotto [] = new int[6]; 
		System.out.print("로또번호 : ");
		for(int i=0; i<lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45)+1;  
		System.out.print(lotto[i]+", ");
		}
			
	}
}
