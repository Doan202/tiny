package bai5;

public class demChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abracadabra";
		int kytu = 'f';
		int dem = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == kytu) {
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("khong tim thay ky tu");
		} else {
			System.out.println(dem);
		}
	}
}
