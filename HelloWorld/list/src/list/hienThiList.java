package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hienThiList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhap so luong phan tu");
		int n=scanner.nextInt();
		List<Integer>ds=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("nhap phan tu thu"+i);
			int x=scanner.nextInt();
			ds.add(x);
		}
		System.out.println("danh sach list duoc in ra la"+ds);
	}

}
