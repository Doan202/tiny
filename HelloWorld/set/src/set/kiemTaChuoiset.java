package set;

import java.util.HashSet;
import java.util.Set;

public class kiemTaChuoiset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> qua = new HashSet<>();
		qua.add("cam");
		qua.add("quyt");
		qua.add("mit");
		qua.add("dua");
		qua.add("dua");
		qua.add("le");
		qua.add("tao");
		qua.add("oi");
		String s = "hvit";
		System.out.println(qua.contains("s"));
	}

}
