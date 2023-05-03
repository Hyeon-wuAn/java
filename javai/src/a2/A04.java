package a2;

import java.util.Scanner;

public class A04 {
	public static void main(String[] args) {
		System.out.println("지폐 단위까지만 돈을 입력하시오.");
		int units[] = {50000, 10000, 5000, 1000};
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		for(int i=0; i<units.length; i++) {
			System.out.println(units[i]+"원은 "+money/units[i]+"장");
			money = money%units[i];
		}
//		money = money%units[i]; // 밖에서는 i가 선언,대입되지 않아서 쓸 수 없음.
	}
}
