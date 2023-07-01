package list;

import java.util.Iterator;
import java.util.Scanner;

public class mangTangGiam {

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
		int demtang = 0;
		int demgiam = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] < a[i + 1]) {
				demtang++;
			}
			if (a[i] > a[i + 1]) {
				demgiam++;
			}
		}

		if (demtang == a.length-1) {
			System.out.println("mang tang");
		} 
		else if (demgiam == a.length-1) {
			System.out.println("mang giam");
		}
		else {
			System.out.println("mang hon don");
		}
	}

}
