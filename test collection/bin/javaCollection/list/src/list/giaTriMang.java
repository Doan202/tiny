package list;

import java.util.Scanner;

public class giaTriMang {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 4, 7, 8, 6, 9, 5, 2, };
		int n = a.length;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("gia tri trung binh la "+sum/n);
	}
}