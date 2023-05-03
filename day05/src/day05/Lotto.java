package day05;

import java.util.Arrays;
import java.util.Collections;

public class Lotto {
	public static void main(String[] args) {
		for (int k = 0; k < 5; k++) {
			int lotto[] = new int[6]; // lotto에 6개를 받겠다(공간확보)
			System.out.print("로또번호"+(k+1)+" : ");
			// lotto[0] = 10; 부터 lotto[5] = 15; 이런식으로 쓸 수 있지만 반복문을 쓰기 불편.

			for (int i = 0; i < lotto.length; i++) {
				// static : 선언 없이 바로 쓸 수 있음(scanner와는 다름.)
				lotto[i] = (int) (Math.random() * 45) + 1; // 0~1 사이의 실수 , 로또 번호 1~45
				//10,20,30
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			// filtering / sorting (순서매기기)
			Arrays.sort(lotto);
			// Arrays.sort(lotto,Collections.reverseOrder());
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + ",");
			}
			System.out.println();
		}

	}
}
