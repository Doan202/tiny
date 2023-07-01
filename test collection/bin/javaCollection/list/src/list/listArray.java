package list;

import java.util.ArrayList;

public class listArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> danhsach = new ArrayList<>();
		danhsach.add("toan");
		danhsach.add("ly");
		danhsach.add("hoa");
		danhsach.add("anh");
		danhsach.add("sinh");
		danhsach.add("su");
		danhsach.add("dia");
		danhsach.add("cong nghe");
		System.out.println("phan tu trong array list la " + danhsach);
		String[] mang = new String[danhsach.size()];
		danhsach.toArray(mang);
		System.out.println("cac phan tu trong mang");
		for (String string : mang) {
			System.out.println(string);
		}
	}
}