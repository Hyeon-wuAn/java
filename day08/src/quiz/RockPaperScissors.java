package quiz;

import java.util.Scanner;

//Player vs Computer

class Player {
	private String name;
	private Scanner scanner = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int turn() {
		System.out.print(name + "[가위 (1), 바위(2), 보(3), 끝내기(4) ]"); // private이라도 같은 블럭안에서는 접근 가능
		return scanner.nextInt();
	}

}

class Computer extends Player {
	public Computer(String name) {
		super(name);
	}

	public int turn() {
		return (int) (Math.random() * 3 + 1);
	}
}

public class RockPaperScissors {
	public static void main(String[] args) {

		String rockPaperScissors[] = { "가위", "바위", "보" };

		Player me = new Player("성호");
		Computer computer = new Computer("슈퍼컴퓨터");

		while (true) {
			int playerChoice = me.turn(); // 사람이 선택한 것.
			if (playerChoice == 4) {
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			System.out.println(me.getName() + " : " + rockPaperScissors[playerChoice - 1]);
			int computerChoice = computer.turn();
			System.out.println(computer.getName() + " : " + rockPaperScissors[computerChoice - 1]);

			if (playerChoice == computerChoice) {
				System.out.println("비겼음");
			} else if (playerChoice == 1 & computerChoice == 3) {
				System.out.println("이겼음");
			} else if (playerChoice == 2 & computerChoice == 1) {
				System.out.println("이겼음");
			} else if (playerChoice == 3 & computerChoice == 2) {
				System.out.println("이겼음");
			} else {
				System.out.println("졌음");
			}
		}
	}
}
