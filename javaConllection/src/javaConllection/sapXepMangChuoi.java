package javaConllection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class sapXepMangChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap do dai phan tu");
		int n = scanner.nextInt();
		String a[]=new String[n];
		scanner.nextLine();
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu"+i);
			a[i]=scanner.nextLine();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
