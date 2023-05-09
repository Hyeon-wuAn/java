package day10;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		int c;
		try {
			FileReader fileReader = new FileReader("C:\\Temp\\test02.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out, 1024);
			while((c = fileReader.read())!=-1){						//뒤에 있는 숫자 단위로 끊어져서 출력됨.
				bufferedOutputStream.write(c);
			}
			bufferedOutputStream.flush(); //남은 글자 밀어보냄.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
