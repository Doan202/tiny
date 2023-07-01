package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class xoaPhanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "dan phuong");
		hashMap.put(2, "hoài duc");
		hashMap.put(3, "quoc oai");
		System.out.println("before"+ hashMap);
		hashMap.remove(1);
		System.out.println("after" + hashMap);
	}
}