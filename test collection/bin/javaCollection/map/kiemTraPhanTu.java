import java.util.HashMap;

public class kiemTraPhanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(1, "red");
		map1.put(2, "green");
		map1.put(3, "blue");
		System.out.println("cac phan tu trong map1"+ map1);
		if (map1.containsKey(4)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
