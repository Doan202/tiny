package javaConllection;

import java.util.Scanner;

public class tongMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu mang");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min=a[i];
			}
		}
		System.out.println("phan tu co gia tri max la"+max);
		System.out.println("phan tu co gia tri min la"+ min);
	System.out.println("tong phan tu dat gia tri min^2+max^2= " +( Math.pow(min, 2)+Math.pow(max, 2)));
	}
}
