package day08;

public class StringTest {
	public static void main(String[] args) {
		String str01 = new String("Java");
		String str02 = new String("Java Script");
		
		System.out.println(str01.length());
		System.out.println(str02.length());
		System.out.println(str01.contains("av"));
		System.out.println(str01.contains("J"));
		System.out.println(str01.contains("Jv"));
		System.out.println(str01.concat(str02)); // concat 연결
		
		String str03 = "Java,Oracle,Javascript,Jsp,Springg";
		
		String strList[] = str03.split(",");
		for(String str : strList) { // for each
			System.out.print(str+"/");
		}
		System.out.println();
		String jumin = "9012122312345";
		System.out.println(jumin.substring(0,6)); // 0에서 6까지만 끊어져나옴
		//90년12월12일
		System.out.println(jumin.substring(0,2)+"년"+jumin.substring(2,4)+"월"+jumin.substring(4,6)+"일");
		String year = jumin.substring(0,2);
		String month = jumin.substring(2,4);
		String date = jumin.substring(4,6);
	}
}
