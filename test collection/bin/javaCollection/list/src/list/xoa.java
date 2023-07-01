package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>dS =new ArrayList<>();
		dS.add(1);
		dS.add(4);
		dS.add(7);
		dS.add(8);
		dS.add(9);
		dS.add(6);
		dS.add(7);
		dS.add(3);
		dS.add(2);
		dS.add(5);
		dS.remove(3);
		System.out.println(dS);
	}

}
