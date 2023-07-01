package bai2;

import java.util.Scanner;

public class nhapThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thang;
		System.out.println("nhap thang trong nam");
		Scanner scanner = new Scanner(System.in);
		thang = scanner.nextInt();
		switch (thang) {
		case 1:
		case 2:
		case 3:
			System.out.println("mua xuan");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("mua he");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("mua thu");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("mua dong");
			break;
		default:
			System.out.println("khong phai thang trong nam");
			break;
		}
	}

}
