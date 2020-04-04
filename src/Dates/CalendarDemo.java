package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(cal.getTime());
System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println(cal.get(Calendar.AM_PM));

	}

}
