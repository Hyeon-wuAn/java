package day05;

public class Array021 {
	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 7, 9, 10, 12, 19, 900, 30 }; // 배열은 중요하다..
		System.out.println(nums.length);

		int total = nums.length;
		System.out.println(total);

		String fruits[] = new String[5];
		fruits[0] = "포도";
		fruits[1] = "딸기";
		fruits[2] = "사과";
		fruits[3] = "오렌지";
		fruits[4] = "키위";
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

//		String fruit0 = "포도";
//		String fruit1 = "딸기";
//		String fruit2 = "사과";
//		String fruit3 = "오렌지";
//		String fruit4 = "키위";
//		System.out.println(fruit0);
//		System.out.println(fruit1);
//		System.out.println(fruit2);
//		System.out.println(fruit3);
//		System.out.println(fruit4);

		System.out.println("===========================");
		String animals[] = { "강아지", "고양이", "사자", "호랑이" };
//		System.out.println(animals.length);
//		System.out.println(animals[0]);
//		System.out.println(animals[1]);
//		System.out.println(animals[2]);
//		System.out.println(animals[3]);
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("===========================");
		for (String AA : animals) { // for-each 문
			System.out.println(AA);
		} // 위처럼 animals 인 경우면 보통 AA 대신에 animal 이라 쓴다.

		System.out.println("===========================");

		// 3,5,6,7,8,14,37,64,87,90 중에 3의 배수만 출력
		int nums02[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 889889, 898, 909, 784387 };
		System.out.println(nums02.length);
		for (int i = 0; i < nums02.length; i++) {
			if (nums02[i] % 3 == 0) {
				System.out.print(nums02[i] + " ");
			}
		}
		System.out.println();
		System.out.println("===========================");
		for (int num : nums02) {
			if (num % 3 == 0) {
				System.out.print(num + " ");
			}
			}
		}

	
}
