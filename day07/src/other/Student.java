package other;

import day07.Person; // 다른 패키지에 속하므로 import 해야함.

public class Student extends Person {
	public void set() {
		this.height=185;
		this.setWeight(90);
		this.name="홍길동";
	}
}
