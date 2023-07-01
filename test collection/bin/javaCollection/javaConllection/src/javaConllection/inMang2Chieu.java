package javaConllection;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class inMang2Chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		System.out.println("nhap so luong phan tu mang 2 chieu");
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		n=scanner.nextInt();
		int a[][]= new int [m][n];
		for (int i = 0; i < m; i++) {
			System.out.println("nhap vao phan tu hang "+i);
			for (int j = 0; j < n; j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
