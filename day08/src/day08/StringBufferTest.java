package day08;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil"); // 문자를 더해줌
		System.out.println(sb);
		sb.insert(7, " my"); // 7번째 뒤부터 넣어줌
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		sb.delete(7, 12);
		System.out.println(sb);
		sb.setLength(4);  //앞에서부터 문자 길이 제한
		System.out.println(sb);
		
		//sb는 String 이 아님 
		//문자열로 쓰려면 형변환 해야함
//	    String str = sb.toString();
	}
}
