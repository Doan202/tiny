package list;

import java.util.ArrayList;

public class timViTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ds = new ArrayList<>();
		ds.add("cam");
		ds.add("quýt");
		ds.add("mit");
		ds.add("dua");
		ds.add("dua");
		ds.add("le");
		ds.add("tao");
		ds.add("oi");
		String phantucantim = "dua";
		int vitridautien = ds.indexOf(phantucantim);
		int vitricuoicung = ds.lastIndexOf(phantucantim);
		System.out.println("vi tri dau tien cua dua la " + vitridautien);
		System.out.println("vi tri cuoi cung cua dua la " + vitricuoicung);
	}

}
