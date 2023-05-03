package quiz;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	public void showInfo() {
		System.out.println(this.getSize()+"인치 "+color+"컬러");
	}
	public int getColor() { //Source 의 getters/setters에서 가져옴
		return color;
	}	
	
}
