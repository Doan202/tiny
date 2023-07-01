package funcion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class chanDauTien {

	public static int hamnguyen(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
					return a[i];
			}
		}
		return hamnguyen(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i]=scanner.nextInt();
		}
		System.out.println(hamnguyen(a));
	}
}
