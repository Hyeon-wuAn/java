package quiz;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src); // 바꿔주기...
	abstract public String srcString();
	abstract public String destString();
	protected double ratio; // protected 는 다른 패키지에서도 상속하면 쓸 수 있음.
	public void converting() { //converting은 다음 {} 사이의 내용으로 실행된다.
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꾸어 줍니다.");
		System.out.println(srcString()+"을 입력하세요.");
		double inputValue = scanner.nextDouble(); //!! scanner 가 double형의 실수를 입력받는다.
		double result = convert(inputValue); //다른 패키지에서 정해둔 convert의 내용에 따라 실행.
		System.out.println("변환결과 : "+result+destString()+"입니다.");
				
	}
}
