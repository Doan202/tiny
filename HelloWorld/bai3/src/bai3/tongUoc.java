package bai3;

import java.util.Scanner;

public class tongUoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap cao so nguyen a<100");
			n = scanner.nextInt();
		} while (n > 100);
		int sum = 0;
		if (n % 2 == 0) {
			System.out.println("la so chan");
			for (int i = 1; i <= n; i++) {
				if (n%i==0) {
					sum+=i;
				}
			}
			System.out.println("tong cua uoc cac so chan la " + sum);

		} else {
			System.out.println("n la so le");
		}
	}

}
