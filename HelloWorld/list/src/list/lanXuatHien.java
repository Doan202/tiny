package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.Condition;

public class lanXuatHien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>number = new ArrayList<>();
number.add(3);
number.add(3);
number.add(4);
number.add(2);
number.add(3);
number.add(1);
number.add(7);
number.add(4);
number.add(1);
int xuathien= Collections.frequency(number,4);
System.out.println(xuathien);
	}
}
