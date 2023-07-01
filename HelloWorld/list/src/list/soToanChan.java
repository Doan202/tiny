package list;

import java.util.Scanner;

public class soToanChan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai phan tu");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu" + i);
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int check = 1;
			int temp = a[i];
			while (temp != 0) {
				if (temp % 2 == 1) {
					check = 0;
					break;
				}
				temp = temp / 10;
			}
			if (check == 1) {
				System.out.println(a[i]);
			}
		}
	}

}
