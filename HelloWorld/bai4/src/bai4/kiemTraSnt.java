package bai4;

import java.util.Scanner;

public class kiemTraSnt {
	public static boolean soNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			} 

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap so nguyen n");
		n=scanner.nextInt();
		boolean a=soNguyenTo(n);
		System.out.println(n);
	}

}
