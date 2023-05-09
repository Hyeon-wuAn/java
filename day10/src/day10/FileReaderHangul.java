package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderHangul {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\hangul.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");//utf8이 제일 많이 쓰임.
			System.out.println("인코딩 방식은==="+inputStreamReader.getEncoding());
			
			int c;
			while((c = inputStreamReader.read()) != -1) { // -1이 문자의 마지막을 의미
				System.out.print((char)c); //c를 int에서 char로 형변환
			}
			inputStreamReader.close();
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
