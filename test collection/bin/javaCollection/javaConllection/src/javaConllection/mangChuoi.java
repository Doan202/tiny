package javaConllection;

import java.util.Scanner;

public class mangChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		scanner.nextLine();
		String a[] = new String[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextLine();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i].length() % 2) != 0) {
				sum += a[i].length();
			}
		}
		System.out.println("tong do dai cac chuoi le la" + sum);
	}

}
