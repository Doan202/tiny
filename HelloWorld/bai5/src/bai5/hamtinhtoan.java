package bai5;

import java.util.Scanner;

public class hamtinhtoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		System.out.println("nhap tham so a,b,c va tinh toan");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		System.out.println("gia tri sin a/b= "+Math.sin(a*1.0/b));
		System.out.println("luy thua a mu c ="+Math.pow(a,c));
		System.out.println("can bac 2 cua gia tri c= " +Math.sqrt(c));
		System.out.println("gia tri tuyet doi cua a*b= ="+Math.abs(a*b));
		
	}

}
