package day06;

public class LottoTest {

	public static void main(String[] args) {
		// main은 이름이 정해져있음.
		// static을 써서 미리 메모리에 띄워두기 위해 쓴다.
		Lotto lotto = new Lotto();
		lotto.howMany(2);
		
		Lotto lotto02 = new Lotto(2);
	}
}
