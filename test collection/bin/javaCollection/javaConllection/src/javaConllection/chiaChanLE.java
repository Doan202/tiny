package javaConllection;

import java.util.Iterator;
import java.util.Scanner;

public class chiaChanLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, c, d;
		do {
			System.out.println("nhap so luong phan tu");
			n = scanner.nextInt();
		} while (n < 0);
		int a[] = new int[n];
		int ch[] = new int[n];
		int le[] = new int[n];

		System.out.println("nhap mang da cho");
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}
		c = d = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				ch[c] = a[i];
				c++;
			} else {
				le[d] = a[i];
				d++;
			}
		}
		System.out.println("mang chan la");
		for (int i = 0; i < c; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("mang le la");
		for (int i = 0; i < d; i++) {
			System.out.println(le[i]);
		}

	}

}
