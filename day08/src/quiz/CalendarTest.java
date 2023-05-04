package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd - HH:mm:ss");
		dateFormat.format(now.getTime());
		System.out.println(dateFormat.format(now.getTime()));
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);
		System.out.println(hourOfDay+":"+minutes);
		if(hourOfDay>6 && hourOfDay<=11) {
			System.out.println("good morning");
		}else if(hourOfDay<=17) {
			System.out.println("good afternoon");
		}else if(hourOfDay<=21) {
			System.out.println("good evening");
		}else {
			System.out.println("good night");
		}
		
	}
}
