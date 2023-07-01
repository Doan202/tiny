import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        List<Integer> danhSach = new ArrayList<>();
        danhSach.add(1);
        danhSach.add(2);
        danhSach.add(3);
        danhSach.add(4);
        danhSach.add(5);

        System.out.println("Danh sach ban dau: " + danhSach);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int x = scanner.nextInt();

        if (danhSach.contains(x)) {
            danhSach.remove(Integer.valueOf(x));
            System.out.println("Danh sach sau khi xoa: " + danhSach);
        } else {
            System.out.println("Phan tu khong ton tai trong danh sach");
        }
    }
}
