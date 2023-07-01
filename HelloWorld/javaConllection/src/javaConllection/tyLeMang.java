package javaConllection;

import java.util.Iterator;
import java.util.Scanner;

public class tyLeMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai mang");
		int n=scanner.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu"+i);
			a[i]=scanner.nextInt();
		}
		int dem=0;
		System.out.println("day phan tu le la");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
				dem++;
			}
		}
		System.out.println("so luong phan tu le la "+ dem);
		System.out.println("ty le xuat hien phan tu le la"+(1.0*dem/n)) ;
	}

}
