package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class xoaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mon = new HashSet<String>();
		mon.add("toan");
		mon.add("ly");
		mon.add("hoa");
		mon.add("van");
		mon.add("anh");
		mon.add("toan cao cap");
		mon.add("sinh hoa");
		mon.remove("ly");
		System.out.println(mon);

	}

}
