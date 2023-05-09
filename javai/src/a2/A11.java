package a2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter fileWriter = new FileWriter("C:\\Temp\\justmade\\please.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;
				fileWriter.write(line);
//				fileWriter.write(line, 1, 4);
				//console에 적은 글자 중 1(두번째)부터 4(다섯번째)까지
				fileWriter.write("\r\n");
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
