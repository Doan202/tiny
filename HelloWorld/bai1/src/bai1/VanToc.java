package bai1;

import java.util.Scanner;

public class VanToc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double gio,phut, giay,thoiGian;
		double quangDuong;
		double vT1,vT2,vT3;
		System.out.println("nhap Quang duong (m)");
		quangDuong=sc.nextDouble();
		System.out.println("nhap gio");
		gio=sc.nextDouble();
		System.out.println("nhap phut");
		phut=sc.nextDouble();
		System.out.println("nhap giay");
		giay=sc.nextDouble();
		thoiGian=gio*3600+phut*60+giay;
		vT1=quangDuong/thoiGian;// m/s
		vT2=(quangDuong/1000)/(thoiGian/3600);  // km/h
		vT3=(quangDuong/1000)/thoiGian;     // km/s
		System.out.println(vT1);
		System.out.println(vT2);
		System.out.println(vT3);
	}
}
