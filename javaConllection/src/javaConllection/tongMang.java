package javaConllection;

import java.util.Scanner;

public class tongMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap so luong phan tu");
		int n=scanner.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu "+i);
			a[i] =scanner.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("tong gia tri mang la "+sum);
	}
}
