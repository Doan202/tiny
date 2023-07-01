package bai2;

import java.util.Scanner;

public class khoangCach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1;
		int a2;
		int b1;
		int b2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap he so a1,a2,b1,b2");
		a1= scanner.nextInt();
		a2=scanner.nextInt();
		b1=scanner.nextInt();
		b2=scanner.nextInt();
		if (a1!=0 && a2!=0) {
			if (a1==a2&&b1!=b2) {
				System.out.println("hai duong thang song song voi nhau");
			}
			else if (a1!=a2) {
				System.out.println("hai duong thang cat nhau");
			}
			else {
				System.out.println("hai duong thang trung nhau");
			}
		}
	}

}
