package javaConllection;

import java.util.Scanner;

public class listdiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap do dai phan tu mang");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				a[i] = 0;

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
