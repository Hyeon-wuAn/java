package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public Lotto() {
		
	}
	public Lotto(int many) {
		howMany(many);
	}
	public void howMany(int many) {
		for(int i=0;i<many;i++) {
			makeLotto();
		}
		
	}
	
	private void makeLotto() { // howmany가 나오고 더 이상 make는 의미가 없으니 접근제한자private 로 변경.
		int lotto[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 0~1 사이의 실수 , 로또 번호 1~45
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
