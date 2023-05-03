package a2;

public class A02 {
	public static void main(String[] args) {
		// 3,5,6,7,8,14,37,64,87,90 중에 3의 배수만 출력
		int num[] =  {3,5,6,7,8,14,37,64,87,90};
		for (int i=0; i<num.length; i++) {
			if(num[i]%3==0) {
				System.out.print(num[i]+" ");
			}
		}
		
	}
}
