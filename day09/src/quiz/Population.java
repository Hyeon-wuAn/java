package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		nations.put("한국", 5000);
		nations.put("미국", 25000);
		nations.put("중국", 100000);
		nations.put("인도", 120000);
		nations.put("일본", 15000);
		Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("나라를 입력하세요. exit를 쓰면 종료.");
		String name = scanner.next();
		Integer population = nations.get(name);
		if(name.equals("exit")) break;
		if(name==null) System.out.println("없는 나라입니다.");
		else System.out.println(name+"의 인구는 "+population+"입니다.");
			
			

		}
	}
}
