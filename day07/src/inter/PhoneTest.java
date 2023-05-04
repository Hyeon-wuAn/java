package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Gallaxy gallaxy22 = new Gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receiveCall();
		
		gallaxy22.samsungPay();
		gallaxy22.sendSMS();
		gallaxy22.receiveSMS();
		
		Iphone iphone10 = new Iphone();
		iphone10.sendCall();
		iphone10.receiveCall();
		iphone10.applePay();
		
		PhoneInterface myPhone = new Iphone(); // interface의 장점. 
//												  new 뒤에 쓰고싶은걸 붙일 수 있음
//		myPhone. send, reveive 는 되지만 pay는 되지않음. 기본 PhoneInterface에 없었기 때문에
	}
}
