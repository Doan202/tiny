package bai5;

public class chuanHoaEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=" Nguyen DuC TOAN";
		st=st.toLowerCase().trim();
		while (st.contains(" ")) {
			st= st.replace(" ", "");
		}
		System.out.println(st+"@hvitclan.vn");
		
	}

}
