package bai4;

import java.util.Scanner;

public class chanLe {
	public static boolean chanLe(int n) {
		String dayso = String.valueOf(n);
		for (int i = 0; i < dayso.length() - 1; i++) {
			if (dayso.charAt(i) % 2 == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap day so x");
		x = scanner.nextInt();
		System.out.println(chanLe(x));
	}

}
