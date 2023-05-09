package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class ImageCopy {
	public static void main(String[] args) {
		//조금 늦게 생길 수 있음.
		File originalImg = new File("C:\\Temp\\aaa.png");
		File copyImg = new File("C:\\Temp\\aaa_copy.png");
		Date date = null;
		int c;
		try {
			FileInputStream fileInputStream = new FileInputStream(originalImg);
			FileOutputStream fileOutputStream = new FileOutputStream(copyImg);
			byte buffer[]=new byte[1024];
			date = new Date();
			date.getTime();
			long start = date.getTime();
			System.out.println(start);
			
			//-1 eof end of file  
//			while((c = fileInputStream.read())!=-1) {
//				fileOutputStream.write((byte)c); // 이미지타입 카피 byte
//			}
			while(true) {
				int num = fileInputStream.read(buffer); //
				System.out.println(num);
				fileOutputStream.write(buffer,0,num);
				if(num<buffer.length) break;
			}
			date.getTime();
			long end = date.getTime();
			System.out.println((end-start));
			
			
			fileInputStream.close();
			fileOutputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
