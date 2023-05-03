package day07;

public class Person {
	private int weight;
	int age;//default  // 패키지 내에서만
	public String name; 
	protected int height; // 상속받으면 넘어옴
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	
//	public int getWeight() {
//		return weight;
//	}
	
}
