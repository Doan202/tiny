package bai3;

import java.util.Scanner;


public class timUocLe {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap so nguyen n");
			n = scanner.nextInt();
			if (n<0) {
				System.out.println("yeu cau nhap lai ");
			}
		} while (n<0);
		for (int i = n-1; i >=1; i--) {
			if (n%i==0&&i%2!=0) {
				System.out.println("uoc le lon nhat la "+i);
				break;
			}
		}
	}

}
