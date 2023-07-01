package bai6;

import java.time.LocalDate;
import java.util.Calendar;

public class dataTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar calendar=Calendar.getInstance();
int day=calendar.get(calendar.DAY_OF_MONTH);
int month=calendar.get(calendar.MONTH) + 1;
int year=calendar.get(calendar.YEAR);
int HH=calendar.get(calendar.HOUR_OF_DAY);
int mm=calendar.get(calendar.MINUTE);
int ss=calendar.get(calendar.SECOND);
System.out.print(day+"/"+month+"/"+year);
System.out.print("/"+HH+"/"+mm+"/"+ss);
	}

}
