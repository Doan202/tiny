package set;

import java.util.HashSet;
import java.util.Set;

public class kiemtrarong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> so = new HashSet<Integer>();
		so.add(1);
		so.add(3);
		so.add(4);
		so.add(5);
		so.add(8);
		so.add(9);
		so.add(2);
		System.out.println(so.isEmpty() ? "co" : "khong");
	}
}
