package ss3_array.min_array;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        // Tạo và nhập mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[]arrNumber1 = new int[size];
        for (int i = 0; i < arrNumber1.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arrNumber1[i] = Integer.parseInt(scanner.nextLine());
        }
        // Tìm min của mảng
        int min = arrNumber1[0];
        for (int i = 1; i < arrNumber1.length; i++) {
            if (min > arrNumber1[i]) {
                min = arrNumber1[i];
            }
        }
        // In ra số nhỏ nhất
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}
