package bai4;
import java.util.Scanner;
public class tongUoc {
	public static int tichUoc(int n) {
		int tich = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				tich*=i;
			}
		}
		return tich;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int x;
System.out.println("nhap phan tu x");
x=scanner.nextInt();
System.out.println(tichUoc(x));

	}

}
