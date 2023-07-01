package javaCollection;

import java.awt.Checkbox;
import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class nhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap phan tu n");
		int n = scanner.nextInt();
		List<Integer> ds = new ArrayList<>();
		List<Integer> ds0 = new ArrayList<>();
		List<Integer> ds1 = new ArrayList<>();
		while (n > 0) {
			int du = n % 2;
			if (du == 0)
				ds0.add(du);
			else {
				ds1.add(du);
			}
			ds.add(du);
			n /= 2;
		}

		for (Integer integer : ds) {
			System.out.print(integer);
		}
		System.out.println();
		for (Integer integer : ds0) {
			System.out.print(integer);
		}
		System.out.println();
		for (Integer integer : ds1) {
			System.out.print(integer);
		}
	}
}
