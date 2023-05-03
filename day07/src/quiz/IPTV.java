package quiz;

public class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size,color); // super~ 첫줄에 올라와야함.
		this.ip=ip;
	}
	public void showInfo() {
		System.out.print("IP 주소는 "+ip);
		super.showInfo();
	}
}
