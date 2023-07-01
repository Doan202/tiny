package javaConllection;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class sapXepChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}
		
		int demChan = 0;
		int demLe = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[demChan] = a[i];
				demChan++;
			}else {
				c[demLe] = a[i];
				demLe++;
			}
		}
		
		
		for(int i=0;i<b.length-1;i++) {
			System.out.println(b[i] + " ");
		}
		
		Arrays.sort(c);
		
		
		int mang[] = new int[n];
		for(int i=0;i<demChan-1;i++) {
			mang[i] = b[i];
		}
		
		for(int i=c[c.length-2];i>=0;i--) {
			mang[demChan-1] = c[i];
			demChan++;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(mang[i] + " ");
		}
		

	}
}
