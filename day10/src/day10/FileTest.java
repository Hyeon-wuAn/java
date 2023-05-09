package day10;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file01 = new File("C:\\Windows\\system.ini");
		System.out.println(file01.getPath()); // file01 경로 확인
		//    \" -> "를 문자로 인식.
		//    \도 특수문자이기 때문에 따로 쓸 수 없어서 \\가 된다.
		System.out.println(file01.getName());
		System.out.println(file01.getParent());
		System.out.println(file01.isFile());	  // 파일인가?
		System.out.println(file01.isDirectory()); // 폴더인가?
		if(!file01.exists()) file01.mkdir();
		
		File file02 = new File("C:\\Temp\\sample"); //sample은 확장자가 없어서 폴더로 생성됨.
		if(!file02.exists()) //file02가 존재하지 않는다면
		file02.mkdir();  // makedirectory
		file02.renameTo(new File("C:\\Temp\\java.sample"));
		
		System.out.println("=================");
		
		File file03 = new File("C:\\Temp");
		File[] subFiles = file03.listFiles();
		for(int i=0; i<subFiles.length; i++) {
			File file = subFiles[i];
			System.out.println(file.getName());
		}
	}
}
