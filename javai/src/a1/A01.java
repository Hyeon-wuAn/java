package a1;

public class A01 {
	public static void main(String[] args) {
		// 증감연산자 응용
		
                    //   x   y   z 
      int x = 1;    //   1
      int y = x++;  //   1   1
      System.out.println("y="+y);
      System.out.println("x="+x);
      int z = y++;  //   2   1   1
      System.out.println("z="+z);
      int w = ++x;
      System.out.println("w="+w); // w=3
		
      // !증감연산자의 위치 기억해서 순서 맞추기.!
		
		              //   a   b   c 
		int a = 1;    //   1
		int b = ++a;  //   2   2
		int c = ++b;  //   2   3   3
		System.out.println(c);   
		c++;
		System.out.println(c);
		++c;
		System.out.println(c);
		

		
		
	}
}
