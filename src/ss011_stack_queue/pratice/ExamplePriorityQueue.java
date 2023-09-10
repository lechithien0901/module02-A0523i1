package ss011_stack_queue.pratice;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ExamplePriorityQueue {
    public static void main(String[] args) {
        // Tạo một PriorityQueue kiểu Integer với bộ so sánh giảm dần
        ArrayDeque<Integer>arrayDeque=new ArrayDeque<>();

        // Thêm các số nguyên vào PriorityQueue
        arrayDeque.add(5);
        arrayDeque.add(2);
        arrayDeque.add(9);
        arrayDeque.add(1);
        arrayDeque.add(7);
        arrayDeque.add(5);
        // In các phần tử theo thứ tự ưu tiên
        System.out.println("Phần tử trong PriorityQueue theo thứ tự ưu tiên giảm dần:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.poll()); // Lấy và in phần tử có độ ưu tiên cao nhất
        }
    }

}
