package bai1;

import java.util.Scanner;

public class diemTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double toan,van,anh;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap diem toan,van,anh");
			toan=scanner.nextInt();
			van=scanner.nextInt();
			anh=scanner.nextInt();
		} while (toan<0||van<0||anh<0||toan>10||van>10||anh>10);
		double tB=(toan+van+anh)/3;
		System.out.println("diem trung binh "+tB);
		if(tB<=4)
		{
			System.out.println("hoc luc yeu");
		}
		else if(tB>4&&tB<=6.5) 
		{
			System.out.println("hoc luc trung binh");
		}
		else if (tB>6.5 &&tB<=8) 
		{
				System.out.println("hoc luc kha");
		}
		else if (tB>8&tB<=9)
		{
			System.out.println("hoc luc gioi");
		}
		else 
		{
			System.out.println("hoc luc xuat sac");
		}
	}
}


