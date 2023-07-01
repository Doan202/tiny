import java.util.*;

public class ReverseIteratorExample {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));

        // Tạo một Iterator và di chuyển tới phần tử cuối cùng
        ListIterator<Integer> iterator = collection.listIterator(collection.size());

        // Sử dụng vòng lặp để duyệt và hiển thị các phần tử từ cuối lên đầu
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            System.out.print(element + " ");
        }
    }
}
