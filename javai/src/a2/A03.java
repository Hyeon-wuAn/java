package a2;

import java.util.Scanner;

public class A03 {
	public static void main(String[] args) {
		System.out.println("얼마를 바꿀건가요? 금액을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		System.out.println(money/50000);
		money = money%50000;
		System.out.println(money/10000);
		money = money%10000;
		System.out.println(money/5000);
		money = money%5000;
		System.out.println(money/1000);
		money = money%1000;
		
		
		
	}
}
