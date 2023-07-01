package javaConllection;

import java.util.Iterator;
import java.util.Scanner;

public class tachSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập số nguyên: ");
        int n = scanner.nextInt();
        String s=Integer.toString(n);
        System.out.println("so duoc tach ra la "+s);
        boolean tang=true;
        for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)>s.charAt(i+1)){
				tang=false;
				break;
			}
		}
        if (tang==true) {
			System.out.println("la day tang");
		}
        else {
			System.out.println("day khong tang");
		}
    }
}

