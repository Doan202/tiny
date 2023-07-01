package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xaoTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> so = new ArrayList<>();
		so.add(1);
		so.add(3);
		so.add(5);
		so.add(7);
		so.add(9);
		so.add(11);
		so.add(13);
		so.add(15);
		Collections.shuffle(so);
		System.out.println(so);
	}
}
