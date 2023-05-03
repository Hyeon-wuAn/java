package day05;

public class Array02 {
	public static void main(String[] args) {
		
		
		int nums[] = {1,3,5,7,9,10,12,19,900,30};
		System.out.println(nums.length); //length로 갯수 알 수 있음.
		int total = nums.length;
		int sum = 0;
		for(int i=0; i<total; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/total);
		System.out.println(nums[3]); // nums[5] 는 10
		
		System.out.println("================================");
		
		
		//for-each
		int sum02 = 0;
		for(int j : nums) {
			sum02+=j;
			System.out.println(j);
		}
		System.out.println(sum02);
		
		String fruits[] = {"딸기", "사과", "복숭아", "키위"};
		for(String fruit : fruits) {
			System.out.print(fruit+", ");
		}
		int intArray [][] = new int[2][3];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;
		
		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;
		
//		intArray[2][0] = 500;
//		intArray[2][1] = 200;
//		intArray[2][2] = 300;   // 앞에 두개 0,1 만 돼서 2로 시작 안됨.
		
		System.out.println(intArray[0][2]);
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {  
				System.out.print(intArray[i][j]+",");
			}
		}
		
		
		
	}
}
//2차원 배열,