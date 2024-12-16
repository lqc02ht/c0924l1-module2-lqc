package ss4_oop.watch;

import java.util.Random;

public class Run {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Cập nhật chỉ số
                }
            }
            // Hoán đổi phần tử
            int swap = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = swap;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000); // Số ngẫu nhiên trong khoảng 0 - 99,999
        }
        // Đo thời gian sắp xếp
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực thi của thuật toán Selection sort: " +
                stopWatch.getElapsedTime() + " ms");
    }
}
