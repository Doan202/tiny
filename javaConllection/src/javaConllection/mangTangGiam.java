package javaConllection;

import java.time.DayOfWeek;
import java.util.Iterator;
import java.util.Scanner;

public class mangTangGiam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu trong mang");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i] = scanner.nextInt();
		}
		int checkt = 0;
		int checkg = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				checkt = 1;
			} else {
				checkg = 1;
			}
		}
		if (checkt == 0) {
			System.out.println("day tang");
		} else if (checkg == 0) {
			System.out.println("day giam");
		} else {
			System.out.println("khong tang khong giam");

		}
	}

}
