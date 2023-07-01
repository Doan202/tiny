package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lietKeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ds = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu"+i);
			int x = scanner.nextInt();
			ds.add(x);
		}
		System.out.println("in danh sach"+ds);
		
		
	}
}
