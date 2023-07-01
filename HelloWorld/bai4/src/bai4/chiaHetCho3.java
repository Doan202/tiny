package bai4;

import java.util.Scanner;

public class chiaHetCho3 {
	public static boolean chiahet3(int n) {
		int sum = 0;
		while (n > 0) {
			int du = n % 10;
			sum += du;
			 n = n / 10;
		}
		
		System.out.println(sum);
		if (sum % 3 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("nhap so nguyen x");
		x = scanner.nextInt();
		System.out.println(chiahet3(x));
	}

}
