package a2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A12 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("C:\\Temp\\justmade\\please.txt");
			int c;
			while((c= fileReader.read())!=-1) {
				System.out.print((char)c);

//	InputStreamReader 클래스의 read() 메소드를 사용하여, 
//	char를 한 글자씩 읽어올 수 있다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
