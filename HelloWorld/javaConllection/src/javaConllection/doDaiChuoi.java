package javaConllection;

import java.util.ArrayList;
import java.util.Scanner;

public class doDaiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String st[] = { "a", "abc", "ac", "abcde", "bcab" };
		for (int i = 0; i < st.length-1; i++) {
			for (int j = i+1; j < st.length; j++) {
				if (st[i].length() < st[j].length()) {
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}

			
		}
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

}
