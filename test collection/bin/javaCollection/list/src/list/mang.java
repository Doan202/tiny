package list;

import java.util.Iterator;

public class mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 3, 5, 1, 6, 8, 2 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] % 2 == 0 && a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				if (a[i] % 2 != 0 && a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
