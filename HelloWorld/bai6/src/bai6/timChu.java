package bai6;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class timChu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		System.out.println("nhap chuoi");
		String string=st.nextLine();
		int dems=0;
		int demt=0;
			for (int i = 0; i < string.length(); i++) {
				if(string.charAt(i)=='s') {
					dems++;
				}
				if (string.charAt(i)=='t') {
					demt++;
				}
			}
			if (dems>demt) {
				System.out.println("là anh-anh");
			}
			
	}

}
