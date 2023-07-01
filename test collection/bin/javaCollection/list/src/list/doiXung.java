package list;

import java.util.Scanner;

public class doiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}
		int check = 1;
		for (int i = 0; i < n / 2; i++) {
			if (a[i] != a[n - 1 - i]) {
				check = 0;
				break;
			}
		}
		if (check == 0) {
			System.out.println("mang khong doi xung");
		} else {
			System.out.println("mang doi xung");
		}
	}

}
