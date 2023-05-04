package day08;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK); //요일
		System.out.println(day); //일요일이 1,월2,화3,4,5,6~
		int date = now.get(Calendar.DAY_OF_MONTH); //날짜
		System.out.println(date);
		
		System.out.println(now.getTime());
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd - HH:MM:ss");
		dateFormat.format(now.getTime());
		System.out.println(dateFormat.format(now.getTime()));
		
//		int hourOfDay = now.get(Calendar.HOUR_OF_DAY); // 시간
//		int hour = now.get(Calendar.HOUR);
//		int ampm = now.get(Calendar.AM_PM); //오전0, 오후1
//		int min = now.get(Calendar.MINUTE);
//		int sec = now.get(Calendar.SECOND);
//		System.out.println(ampm==0?"오전":"오후 "+hour+"시 "+hourOfDay+"시 "+min+"분 "+sec+"초");
////							 삼항연산자
//		
//		String monthArray[]= 
//			{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
//		
//		String dayArray[]=
//			{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};	
//		System.out.println(dayArray[1]);
//		System.out.println(dayArray[0]);
//		System.out.println(dayArray[6]);
//		System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
		
	}
}
