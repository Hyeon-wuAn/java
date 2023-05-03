package a2;

import java.util.Scanner;

public class A01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		System.out.println("숫자 5개 입력");
		for(int i=0; i<5; i++) {
			intArray[i]=scanner.nextInt();
			if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		System.out.println("입력한 숫자 중 제일 큰 숫자는 "+max+"이다");
	}
}
