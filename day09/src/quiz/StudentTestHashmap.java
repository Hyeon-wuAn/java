package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student02 {
	private String name;
	private String id;
	private String department;
	private double grade;
	public Student02(String name, String id, String department, double grade) {
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


public class StudentTestHashmap {
	public static void main(String[] args) {
		HashMap<String, Student02> studentMap = new HashMap<>();
		studentMap.put("장성호",new Student02("장성호","11","JAVA",3.8));
		studentMap.put("정진영",new Student02("정진영","22","JAVASCRIPT",4.2));
		studentMap.put("안현우",new Student02("안현우","33","ORACLE",4.1));
		studentMap.put("장은진",new Student02("장은진","44","Spring",3.9));
		//iterator 통한 반복문****
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		
		for(Map.Entry<String, Student02> item:studentMap.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
	}
}
		
//		
//		while(it.hasNext()) {
//			String name = it.next();
//			Student02 student = studentMap.get(name);
//			System.out.println(student);
//			
//			Scanner scanner = new Scanner(System.in);
//			while (true) {
//				System.out.println("학생이름을 입력하세요.");
//				String name1 = scanner.next();
//				if (name1.equals("exit"))
//					break;
//			}
//			Student02 student = studentMap.get(name);
//			System.out.println(student.getName()+"/");
//			System.out.println(student.getId()+"/");
//			System.out.println(student.getDepartment()+"/");
//			System.out.println(student.getGrade()+"/");
//		}
//		
//		
//	}
//}
