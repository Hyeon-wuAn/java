package day09;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("토르");
		nameList.add("아이언맨");
		nameList.add("캡틴아메리카");
		nameList.add("스파이더맨");
		nameList.add("김수한무 거북이와 두루미 삼천갑자 동방삭");
		
		Iterator<String> it = nameList.iterator();  //Iterater는 interface라 new쓰지 않음(ctrl 클릭으로 확인 가능)
		while(it.hasNext()) { // hasNext 다음께 있을 때만
		System.out.println(it.next());  
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
	}
}
