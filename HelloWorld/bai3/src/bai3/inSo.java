package bai3;

import java.util.Scanner;

public class inSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("nhap so n (1<=n<50)");
		Scanner scanner = new Scanner(System.in);
		do {
			n=scanner.nextInt();
			System.out.println("yeu cau nhap lai");
		} while (n<1||n>50);
		for(int i =1;i<=n;i++)
		{
			System.out.println("in day so tu 1 den n la " + i);
		}

	}

}
