package bai2;

import java.util.Scanner;

public class chieuCao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double chieuCao;
		System.out.println("nhap chieu cao");
		Scanner scanner=new Scanner(System.in);
		chieuCao=scanner.nextDouble();
		if (chieuCao<145) {
			System.out.println("rat lun");
		}
		else if (chieuCao<150) {
			System.out.println("lun");
		}
		else if (chieuCao>=150&&chieuCao<170) {
			System.out.println("binh thuong");
		}
		else if (chieuCao>=170&&chieuCao<=180) {
			System.out.println("cao");
		} 
		else {
			System.out.println("rat cao");
		}
	}

}
