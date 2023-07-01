package javaConllection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class sapXep {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		int x;
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println("mang dươc sap xep tang dan");
		for (int item : a) {
			System.out.println(item);
		}
	System.out.println("nhap gia tri phan tu x");
			x = scanner.nextInt();
			System.out.println("vi tri dau tien cua "+x+" la "+Arrays.binarySearch(a, x));
	}
}