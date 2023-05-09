package quiz;

import java.util.Scanner;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = 4.5;
		double B = 3.5;
		double C = 3.0;
		double D = 2.0;
		double F = 0.0;
		Vector<String> vec = new Vector<>();
		System.out.println("7 과목을 입력하세요.");
		while(true) {
			String grade = scanner.nextLine();
			if(grade.length()==7) break;
			vec.add(grade);
		}
		double average; 
		
	}
}
