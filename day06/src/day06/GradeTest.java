package day06;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Grade myGrade = new Grade(12,88,99);
		double avg = myGrade.average(5);
		System.out.println(avg);
		
		Lotto lotto = new Lotto();
		lotto.howMany(5);
		
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		
		// class (류(類))
//		사람(먹고 자고 숨쉬고 놀고 술마시고 로또사고)
//		학생(사람 상속 공부) / 선생(사람 상속 강의) / 개발자(사람 상속 개발)
		
	}
}
