package list;

import java.util.ArrayList;
import java.util.List;

public class viTriList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ds = new ArrayList<>();
		ds.add(5);
		ds.add(3);
		ds.add(9);
		ds.add(8);
		ds.add(4);
		ds.add(2);
		ds.add(7);
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(i + "-" + ds.get(i));
		}
	}

}
