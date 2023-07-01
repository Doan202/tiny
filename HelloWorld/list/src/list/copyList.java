package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ds1 = new ArrayList<String>();
		ds1.add("1");
		ds1.add("2");
		ds1.add("3");
		ds1.add("4");
		ds1.add("5");
		List<String> ds2 = new ArrayList<String>();
		ds2.add("a");
		ds2.add("b");
		ds2.add("c");
		ds2.add("d");
		ds2.add("e");
		Collections.copy(ds1, ds2);
		System.out.println("ds1" + ds1);
		System.out.println("ds2" + ds2);
	}

}
