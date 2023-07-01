package bai2;

import java.util.Scanner;

public class timMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("nhap 3 so nguyen");
		Scanner scanner= new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		int max=a;
		if (b>max) {
		max=b;
		}
		if(c>max)
		{
			max=c;
		}
		System.out.println("gia tri lon nhat la"+max);
	}

}
