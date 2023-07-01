package bai1;

import java.util.Scanner;

public class toaDo {
	public static void main(String[] args) {
		int a,b,c,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap he so a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("nhap toa do x,y");
		x=sc.nextInt();
		y=sc.nextInt();
		double kc=(Math.abs(a*x+b*y+c))/Math.sqrt((a*a)+(b*b));
		System.out.printf("khoang cach toa do(x,y) den duong thang la "+ Math.round(kc*10)*1.0/10);
	}

}
