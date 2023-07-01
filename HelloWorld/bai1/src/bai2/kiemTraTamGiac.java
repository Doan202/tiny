package bai2;

import java.util.Scanner;

public class kiemTraTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("nhap 3 goc cua tam giac");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a + b + c != 180) {
			System.out.println("khong la goc cua tam giac");
		}
		if (a + b + c == 180) {
			System.out.println("la 3 goc cua tam giac");
			if (a == b && a == c) {
				System.out.println("la tam giac deu");
			} else if (a == b || a == c || b == c) {
				System.out.println("la tam giac can");
			}

			else if (a == 90 || b == 90 || c == 90) {
				System.out.println("la tam giac vuong");
			} else {
				System.out.println("khong la 3 oc cua tam giac");
			}
		}

	}

}
