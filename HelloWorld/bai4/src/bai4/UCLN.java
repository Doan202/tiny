package bai4;

import java.util.Scanner;

public class UCLN {
	public static int ucln(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;

	}

	public static int bcnn(int a, int b) {
		return a * b / ucln(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap 2 so a va b");
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println(ucln(x, y));
		System.out.println(bcnn(x, y));

	}

}
