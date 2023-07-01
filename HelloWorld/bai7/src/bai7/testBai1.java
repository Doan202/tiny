package bai7;

import java.util.Scanner;

public class testBai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double toan,ly,hoa;
		do {
			System.out.println("nhap diem 3 mon toan ly hoa");
			toan=scanner.nextDouble();
			ly=scanner.nextDouble();
			hoa=scanner.nextDouble();
			if(toan >= 0 && toan <= 10 && ly >= 0 && ly <= 10 && hoa >= 0 && hoa <= 10)
			{
				break;
			}
		}while(toan<0||toan>10||ly<0||ly>10||hoa<0||hoa>10);
		
		if (toan<6.5||ly<5.5||hoa<5.0) {
			System.out.println("diem liet loai");
		}
		else if (toan+ly+hoa>=18.0||toan+ly>=14) {
			System.out.println("thi sinh trung tuyen");
		}
		else {
			System.out.println("vi pham dieu kien");
		}
	}

}
