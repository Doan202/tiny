package bai4;

import java.util.Scanner;

public class tangGiam {
	public static boolean kiemTraTang(int n) {
		String ten = String.valueOf(n);
		for(int i=0;i<ten.length() - 1; i++)
		{
			if(ten.charAt(i+1)>ten.charAt(i))
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("nhap day so nguyen x");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		System.out.println(kiemTraTang(x));
	}

}
