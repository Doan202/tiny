package bai4;

import java.util.Scanner;

public class tongChuoi {
	public static double tongDay(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			 sum += 1.0/ (n * (n + 1));
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("nhap so nguyen x");
		x = scanner.nextInt();
		System.out.println(tongDay(x));

	}

}
