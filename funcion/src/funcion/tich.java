package funcion;

import java.net.Socket;
import java.util.Scanner;

public class tich {
	public static double tich(double a, double b) {
		double tich=a*b;
		return tich;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so x");
		double x = scanner.nextDouble();
		System.out.println("nhap so y");
		double y = scanner.nextDouble();
		System.out.println(tich(x, y));
	}

}
