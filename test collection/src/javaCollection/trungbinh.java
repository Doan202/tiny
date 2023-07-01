package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class trungbinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu danh sach");
		int n = scanner.nextInt();
		List<int[]> dsList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("nhap chieu mang");
			int x = scanner.nextInt();
			System.out.println("nhap do dai mang");
			int[] a = new int[x];
			for(int j=0;j<a.length;j++) {
			System.out.println("nhap phan tu mang thu "+j);
				a[j]=scanner.nextInt();
			}
				
			dsList.add(a);
			
		}
		
		
	}

}
