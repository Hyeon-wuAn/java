package day09;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(5);
		vec.add(3);
		vec.add(1);
		
		vec.add(1, 100); // vec의 항목(index) 1을 100으로 바꿔주겠다.
		System.out.println(vec);
		System.out.println("=========");;
//		System.out.println(vec.size()); // vec.size -> vec 의 갯수
//		System.out.println(vec.get(1));
		
		System.out.println(vec.capacity()); // capacity -> 메모리 차지하는 용량(별로 쓸 일은 없음)
		System.out.println("=========");
		for(int i=0; i<vec.size(); i++) {
			int num = vec.get(i);
			
			System.out.print(num+",");
		}
		System.out.println();
		System.out.println("=================");
		for(int num:vec) { //위를 간단하게 표현도 가능. for(int i=0; i<vec.size; i++) = for(num:vec)
			System.out.print(num+",");
		}
	}
}
