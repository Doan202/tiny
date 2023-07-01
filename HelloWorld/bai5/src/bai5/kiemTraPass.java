package bai5;

import java.util.Scanner;

public class kiemTraPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String taikhoan = "nguyendongkhanh@hvitclan.vn";
		String matkhau = "123456";
		String acc;
		String pass;
		boolean check = false;
		System.out.println("dang nhap tai khoan");
		Scanner scanner = new Scanner(System.in);
		acc = scanner.nextLine();
		System.out.println("nhap password");
		pass = scanner.nextLine();
		if (taikhoan.isEmpty() || matkhau.isEmpty()) {
			check = false;
		}
		if (taikhoan.equals(acc) && matkhau.equals(pass)) {
			check = true;
		} else {
			check = false;
		}
		if (check == true) {
			System.out.println("Dang nhap thanh cong");
		} else {
			System.out.println("xin moi nhap lai");
		}

	}

}
