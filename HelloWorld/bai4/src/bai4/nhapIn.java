package bai4;

import java.util.Scanner;

public class nhapIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("nhap vao gia tri a");
			a=scanner.nextInt();
			if(a>100||a<1)
			{
				System.out.println("khong hop le yeu cau nhap lai");
			}
			
		} while (a>100||a<1);
		System.out.println("in ra so vua nhap la "+a);
	}

}
