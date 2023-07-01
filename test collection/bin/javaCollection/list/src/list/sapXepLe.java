package list;

import java.util.Iterator;

public class sapXepLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 1, 5, 6, 3, 9, 8, 10, 7 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] % 2 != 0 && a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
