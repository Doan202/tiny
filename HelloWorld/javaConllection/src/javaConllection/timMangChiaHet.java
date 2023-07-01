package javaConllection;

import java.util.Iterator;
import java.util.Scanner;

public class timMangChiaHet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap do dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu " + i);
			a[i] = scanner.nextInt();
		}
		int check = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0) {
				System.out.println("so dau tien la boi 10 la" + a[i] + "o vi tri thu " + i);
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("khong co phan tu nao la boi cua 10");
		}
	}

}
