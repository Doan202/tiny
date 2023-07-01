import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Tạo một danh sách để lưu trữ các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Nhập số lượng số nguyên trong danh sách: ");
        int count = scanner.nextInt();

        System.out.println("Nhập các số nguyên:");

        // Đọc các số nguyên từ bàn phím và thêm vào danh sách
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Danh sách số nguyên đã nhập:");
        // In ra danh sách số nguyên đã nhập
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
