package a2;

import java.io.File;

public class A100509 {
	public static void main(String[] args) {
		File file01 = new File("C:\\Temp\\example");
		if(!file01.exists()) file01.mkdir();
		file01.renameTo(new File("C:\\Temp\\justmade"));
		
		File file00 = new File("C:\\Temp");
		File[] subFiles = file00.listFiles();
		//위치 C:\\Temp의 파일들을 subFile[i]에 담음. 
		for(int i=0; i<subFiles.length; i++) {
//			System.out.println(subFiles[i]);
			System.out.println(subFiles[i].getName());
		}
		
	}
}
