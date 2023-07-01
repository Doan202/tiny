package bai5;

public class chuanHoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "    nguyen  Van AN    @hvitclan.vn";
		
		st = st.toLowerCase().trim();
		while(st.contains(" ")){
			st = st.replace(" ", "");
		}
		System.out.println(st);
	}

}
