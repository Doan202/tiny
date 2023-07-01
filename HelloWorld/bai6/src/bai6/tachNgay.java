package bai6;

import java.util.Calendar;

public class tachNgay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar calendar=Calendar.getInstance();
int dd=calendar.get(calendar.DAY_OF_MONTH);
int mm=calendar.get(calendar.MONTH)+1;
int yy=calendar.get(calendar.YEAR);
System.out.println("ngay trong thang la "+dd);
System.out.println("thang trong nam la "+mm);
System.out.println("nam la "+yy);
	}

}
