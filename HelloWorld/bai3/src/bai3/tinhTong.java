package bai3;

import java.util.Scanner;

public class tinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("nhap so nguyen n");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		while (n<0) {
			System.out.println("so phai nguyen duong yeu cau nhap lai");
			n=scanner.nextInt();
			}
		int sum=0;
		int soDu;
		int soNguyen;
		while (n>0) {
			soDu=n%10;
			sum +=soDu;
			n/=10;
		}
		System.out.println("tong so nguyen la "+ sum);
	}
}

