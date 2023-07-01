package bai1;

import java.util.Scanner;

public class DienTichHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap r=");
		r=sc.nextDouble();
		System.out.println("dien tich hinh tron la: " + r*r*Math.PI);
		System.out.println("chu vi hinh tron la "+2*Math.PI*r);
		
	}

}
