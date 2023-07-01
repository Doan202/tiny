package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sapXepTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ds = new ArrayList<>();
		ds.add("cam");
		ds.add("quyt");
		ds.add("mit");
		ds.add("dua");
		ds.add("dua");
		ds.add("le");
		ds.add("tao");
		ds.add("oi");
		Collections.sort(ds);
		for (String str : ds) {
			System.out.println(str);
		}
	}

}
