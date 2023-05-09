package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneReader {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("C:\\Temp\\phone.txt");
			int c;
			while ((c = fileReader.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
// File phone = new File("C:\\Temp\\phone.txt"); 로 설정한 다음
// FileReader fileReader = new FileReader(phone); 도 가능
// while ((c = fileReader.read()) != -1) 대신에
// while(true) { 줄바꿈 c=fileReader.read(); 줄바꿈 if(c==-1) break; 로도 가능.