package bai7;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai mang n");
		n = scanner.nextInt();
		int[] mang = new int[n];
		System.out.println("vui long nhap gia tri mang ");
		for (int i = 0; i < mang.length; i++) {
			mang[i] = scanner.nextInt();
		}
		System.out.println("cac phan tu mang");
		for (int i = 0; i < mang.length; i++) {
			System.out.println(mang[i]);
		}
		 Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	        for (int i = 0; i < n; i++) {
	            addElement(map, mang[i]);
	        }
	        System.out.print("Các phần tử xuất hiện 1 lần: ");
	        for (Integer key : map.keySet()) {
	            if (map.get(key) == 1) {
	                System.out.print(key + " ");
	            }
	        }
	}
	        public static void addElement(Map<Integer, Integer> map, int element) {
	            if (map.containsKey(element)) {
	                int count = map.get(element) + 1;
	                map.put(element, count);
	            } else {
	                map.put(element, 1);
	            }
	        }
}
