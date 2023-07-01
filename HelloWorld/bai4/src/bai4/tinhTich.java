package bai4;

import java.util.Scanner;

public class tinhTich {
	public static int tich(int n) {
		int tich =1;
		while (n>0) {
			int du = n % 10;
			tich *=du;
			n/=10;
		}
		return tich;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("nhap so nguyen x");
		Scanner scanner= new Scanner(System.in);
		x= scanner.nextInt();
		System.out.println("tich cua chu so la "+tich(x));
	}

}
