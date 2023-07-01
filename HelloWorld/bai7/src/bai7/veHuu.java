package bai7;

import java.time.LocalDate;
import java.util.Scanner;

public class veHuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ten;
		int ngay,thang,nam;
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap ten va ngay thang nam sinh");
		ten=scanner.nextLine();
		nam=scanner.nextInt();
		thang=scanner.nextInt();
		ngay=scanner.nextInt();
		LocalDate localDate = LocalDate.of(nam,thang,ngay);
		int nam1 = localDate.getYear() + 60;
		System.out.println(ten+" "+ nam1+ "" + "/" +localDate.getMonthValue() + "/" + localDate.getDayOfMonth()); 
	}


}
