package quiz;

public class RotateText {
	public static void main(String[] args) {
		String str = "globalit java lecture";
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(2));
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.substring(i)+str.substring(0,i));
		}
	}
}
