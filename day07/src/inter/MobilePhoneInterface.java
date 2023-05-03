package inter;

public interface MobilePhoneInterface extends PhoneInterface {
//									인터페이스끼리 상속 가능
	void sendSMS();
	void receiveSMS();
	void sendCall();

}
