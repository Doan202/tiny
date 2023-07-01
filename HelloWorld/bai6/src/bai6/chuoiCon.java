package bai6;

import java.util.Scanner;

public class chuoiCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A;
		String B;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chuoi A");
		A = scanner.nextLine();
		System.out.println("nhap chuoi B");
		B = scanner.nextLine();
		if (A.contains(B) == true) {
			System.out.println("B la chuoi con cua A");
		} else {
			System.out.println("B khong la chuoi con cua A");
		}

	}

}
