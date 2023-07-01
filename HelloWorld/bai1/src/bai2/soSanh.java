package bai2;

import java.util.Scanner;

public class soSanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner Scanner = new Scanner(System.in);
		a = Scanner.nextInt();
		b = Scanner.nextInt();
		if (a > b) {
			System.out.println("a lon hon b");
		} else if (a == b) {
			System.out.println("a bang b");
		} else {
			System.out.println("a nho hon b");
		}
	}

}