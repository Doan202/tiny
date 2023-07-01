package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class xuatHien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> so =new ArrayList<>(List.of(1,2,1,3,3,4,3,5,5));
		int xuathien1=Collections.frequency(so, 1);
		int xuathien2=Collections.frequency(so, 2);
		int xuathien3=Collections.frequency(so, 3);
		int xuathien4=Collections.frequency(so, 4);
		int xuathien5=Collections.frequency(so, 5);
		System.out.println("so lan xuat hien 1 la "+xuathien1);
		System.out.println("so lan xuat hien 2 la "+xuathien2);
		System.out.println("so lan xuat hien 3 la "+xuathien3);
		System.out.println("so lan xuat hien 4 la "+xuathien4);
		System.out.println("so lan xuat hien 5 la "+xuathien5);
		
	}

}
