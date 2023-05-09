package a2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class A13 {
	public static void main(String[] args) {
		File original = new File("C:\\Temp\\justmade\\please.txt");
		File copy = new File("C:\\Temp\\lookwhatimade.txt");
		int c;
		try {
			FileReader fileReader = new FileReader(original);
			FileWriter fileWriter = new FileWriter(copy);
			while((c = fileReader.read())!=-1) {
				fileWriter.write((char)c);
			}
			fileWriter.close();
			fileReader.close(); // 잘 닫아주지 않으면 제대로 copy되지 않음.
			System.out.println(original.getPath()+"를 "+copy.getPath()+"로 복사함.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
