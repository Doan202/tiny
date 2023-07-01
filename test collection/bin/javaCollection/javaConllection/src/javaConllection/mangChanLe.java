package javaConllection;

import java.util.Iterator;
import java.util.Scanner;

public class mangChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i] = scanner.nextInt();
		}
		
		System.out.println("cac phan tu o vi tri chan la");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("cac phantu o vi tri le la");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
