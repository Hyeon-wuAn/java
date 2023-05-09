package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		byte byteArray[] = new byte[6];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Temp\\test.out");
			int num=0;
			int c;
			while((c=fileInputStream.read())!=-1) {
				byteArray[num] = (byte)c;
				num++;
//read() 메소드는, stream의 끝에서 -1을 리턴하므로, 
//read()의 값이 -1이면, 더 이상 파일을 읽지 않고, 반복문을 종료합니다.
			}
			for(int i=0; i<byteArray.length; i++) {
				System.out.print(byteArray[i]+" ");
			}
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
