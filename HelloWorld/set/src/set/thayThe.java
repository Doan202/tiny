package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class thayThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> so = new ArrayList<>();
		so.add("one");
		so.add("two");
		so.add("three");
		so.add("four");
		so.add("five");
		so.add("six");
		so.add("");
		so.add("one");
		so.add("three");
		so.add("four");
		Collections.replaceAll(so, "one", "ten");
		System.out.println(so);
	}
}
