package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class daoNguocds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> so = new ArrayList<>(List.of(1, 4, 7, 8, 9, 6, 3, 2, 5));
		Collections.reverse(so);
		System.out.println(so);
	}
}
