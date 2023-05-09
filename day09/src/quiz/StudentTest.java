package quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	private String name;
	private String id;
	private String department;
	private double grade;
	public Student(String name, String id, String department, double grade) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}
	
}
public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("장성호","11","JAVA",3.8));
		studentList.add(new Student("가가가","22","JAVASCRIPT",4.2));
		studentList.add(new Student("나나나","33","ORACLE",4.1));
		studentList.add(new Student("다다다","44","Spring",3.9));

		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student student = it.next();
//			System.out.println(it.next());
			System.out.println(student.getName());
			System.out.println(student.getId());
			System.out.println(student.getDepartment());
			System.out.println(student.getGrade());
			System.out.println("====================");
			
		}
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("학생이름을 입력하세요");
			String name = scanner.next();
			if(name.equals("exit")) break;
			for(int i=0; i<studentList.size(); i++) {
				Student student = studentList.get(i);
				if(student.getName().equals(name)) {
					System.out.print(student.getName()+"/");
					System.out.print(student.getId()+"/");
					System.out.print(student.getDepartment()+"/");
					System.out.print(student.getGrade()+"/");
					break;
				}
			}
		}
	}
}
