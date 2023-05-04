package day08;

public class WrapperTest {
	public static void main(String[] args) {
		char ch = Character.toLowerCase('A'); //(다음의 char형 ()를 소문자로 바꾼다)
		System.out.println(ch);
		char ch01 = 'a';
		char ch02 = '4';
		Character.isDigit(ch01); // isDigit 은 ()이 숫자인지 따져봄 isAlphabetic 도 있음.
		System.out.println(Character.isDigit(ch01));
		System.out.println(Character.isDigit(ch02));
		
		System.out.println(Character.isAlphabetic(ch01));
		System.out.println(Character.isAlphabetic(ch02));
		
		int age = Integer.parseInt("20");
		if(age>20){
			System.out.println("술집 출입 가능");
		}else {
			System.out.println("술집 출입 안됨");
		}
		
		int num = 20;
		Integer objNum = num; //박싱
		System.out.println(objNum);
		int unboxingNum = objNum+10;
		System.out.println(unboxingNum);
		String str = Integer.toString(unboxingNum);
		System.out.println(str=="30");
		System.out.println(str.equals("30"));
	}
}
