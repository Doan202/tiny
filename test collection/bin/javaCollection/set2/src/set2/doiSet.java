package set2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class doiSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 1, 2, 5, 0, 6, 7 };
		Integer b[] = { 0, 9, 7, 5, 3, 8 };
		List<Integer> list = Arrays.asList(a);
		Set<Integer> set1 = new HashSet<>(list);
		System.out.println(set1);
		List<Integer> list2 = Arrays.asList(b);
		Set<Integer> set2 = new HashSet<>(list2);
		System.out.println(set2);
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
