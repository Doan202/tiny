package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hienThiDanhSach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ds = new ArrayList<>();
		ds.add("xin");
		ds.add("chao");
		ds.add("chuc");
		ds.add("mung");
		ds.add("nam");
		ds.add("moi");
		Iterator<String> a = ds.iterator();
		while (a.hasNext()) {
			String value = a.next();
			System.out.println(value);
		}

	}

}
