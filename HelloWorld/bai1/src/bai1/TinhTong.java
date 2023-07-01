package bai1;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("nhap 2 so a va b");
		Scanner sc =new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		System.out.println((double)a%b);
	}

}
