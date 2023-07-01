package bai6;

import java.util.Scanner;

public class demChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String st = "Baby, I don't feel so good. 6 words you never understood";
		int chucai = 0;
		int so = 0;
		int kytu = 0;
		for (int i = 0; i < st.length(); i++) {
			if (Character.isLetter(st.charAt(i))) {
				chucai++;
			}
			else if (Character.isDigit(st.charAt(i))) {
				so++;
			}
			else {
				kytu++;
			}
			
		}
		System.out.println(chucai+" "+so+" "+kytu);
	}

}
