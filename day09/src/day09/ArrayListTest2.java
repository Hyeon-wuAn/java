package day09;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(3);
		numList.add(2);
		numList.add(1);
		numList.add(0);
		numList.add(-1);
		int biggest = 0;
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		for(int i=0; i<numList.size(); i++) {
			if(numList.get(biggest)<numList.get(i)) {
				biggest = i;
			}
		}
		System.out.println("제일 큰 숫자는 "+numList.get(biggest));
	}

	private static Integer large() {
		// TODO Auto-generated method stub
		return null;
	}
}
