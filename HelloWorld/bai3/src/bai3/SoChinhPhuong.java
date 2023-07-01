package bai3;

import java.util.Scanner;

public class SoChinhPhuong {

	public static boolean KiemTraChinhPhuong(int n)
	{
		double can = Math.sqrt(n);
		if(can * can == n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int tich = 1;
		for(int i = 1; i < n; i++)
		{
			if(KiemTraChinhPhuong(i))
			{
				tich *= i;
			}
		}
		System.out.println(tich);

	}

}
