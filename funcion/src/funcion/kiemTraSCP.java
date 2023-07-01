package funcion;

public class kiemTraSCP {

	public static boolean scp(int n) {
		double can = Math.sqrt(n);
		if (can * can == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		System.out.println(scp(a));
	}

}
