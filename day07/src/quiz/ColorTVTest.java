package quiz;

public class ColorTVTest {
	public static void main(String[] args) {
		ColorTV colorTV = new ColorTV(66, 2480);
		colorTV.showInfo();
		
		IPTV iptv = new IPTV("192.168.0.8",66,3840);
		iptv.showInfo();
	}
}
