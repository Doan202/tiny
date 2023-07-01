package bai3;

import java.util.Scanner;

class namNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thang, nam;
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("nhap thang");
			thang = scanner.nextInt();
			System.out.println("nhap nam");
			nam = scanner.nextInt();
			
		}while ((thang < 0 || thang > 12) || (nam < 1000 || nam > 2022));

		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("thang co 30 ngay");
			break;
		case 2:
			if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
				System.out.println("thang co 29 ngay");
			} else {
				System.out.println("thang co 28 ngay");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("thang co 30 ngay");
			break;
		default:
			break;
		}
		
		scanner.close();
	}

}
