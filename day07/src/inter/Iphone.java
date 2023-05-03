package inter;

public class Iphone implements MobilePhoneInterface {
//											다중상속 가능
	@Override
	public void sendCall() {
		System.out.println("아이폰 신호음이 울립니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요. ");
	}
	
	public void applePay() {
		System.out.println("애플페이 결제할 수 있음.");
	}

	@Override
	public void sendSMS() {
		
	}

	@Override
	public void receiveSMS() {
		
	}

}
