package bai7;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class testBai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("nhap so phan tu n");
			n = scanner.nextInt();
		} while (n < 0);
		double a[] = new double[n];
		System.out.println("nhap cac phan tu cua mang");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d]=", i);
			a[i] = scanner.nextDouble();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("mang vua nhap" + a[i]);
		}
		
		System.out.println("phan tu xuat hien 1 lan" + a[0]);
		for (int i = 1; i < a.length; i++) {
				if (a[i]!=a[i-1]) {
					System.out.println("phan tu xuat hien 1 lan"+a[i]);
				}
			
		}
	}
}


