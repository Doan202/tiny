package javaCollection;

import java.util.Iterator;
import java.util.Scanner;

public class timSNT {
	public static boolean lasnt(int n) {
		if (n <2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("so nguyen to la");
		for (int i = 0; i < n; i++) {
			if (lasnt(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
}
