package instance;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}
class StudentWorker extends Student {}


// 생성자 오버로드
// 메서드 오버로드
// 메서드 오버라이드 기능을 가져오면서 약간 수정..(덮어쓰기)

public class InstanceTest {
	
	static void print(Person person) { // 매개변수를 person으로 받아 사람에 해당되는걸 집어넣을 수 있음.
		if(person instanceof Person) System.out.println("Person입니다.");
		if(person instanceof Student) System.out.println("Student입니다.");
		if(person instanceof Researcher) System.out.println("Researcher입니다.");
		if(person instanceof Professor) System.out.println("Professor입니다.");
		if(person instanceof StudentWorker) System.out.println("StudentWorker입니다.");
	}
	
	public static void main(String[] args) {
		print(new StudentWorker());
	}
}
