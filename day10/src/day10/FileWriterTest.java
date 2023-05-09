package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter fileWriter = new FileWriter("C:\\Temp\\my.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;
				fileWriter.write(line,0,line.length());
				fileWriter.write("\r\n");//케리지리턴, (줄바꿈return\new새로운줄을쓰겠다) 의미(슬래쉬 아님..)
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
