import java.util.Scanner;

public class AlgorithComplexity {
    public static void main(String[] args) {
        long n = 100000;  // Ví dụ: n = 100 triệu
        loopN(n);
    }
    public static void loopN(long n) {
        long startTime = System.currentTimeMillis();  // Sửa: 'startime' -> 'startTime'
        System.out.println("Thời gian bắt đầu: " + startTime);

        long k = 0;
        for (int i = 0; i <= n; i++) {
            k = k + 5;
        }

        long endTime = System.currentTimeMillis();  // Sửa: 'endtime' -> 'endTime'
        System.out.println("Thời gian kết thúc: " + endTime);

        // Sửa: Thiếu dấu ngoặc tròn đóng và dấu ngoặc kép đúng vị trí
        System.out.println("Thời gian chạy: " + (endTime - startTime) + "ms");
    }

}
