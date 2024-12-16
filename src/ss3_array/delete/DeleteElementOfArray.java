package ss3_array.delete;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên N(số lượng phần tử của mảng):");
        int N = Integer.parseInt(scanner.nextLine());
        int[]arrNumber = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập vào số nguyên n cần xoá khỏi mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        if (isInArray(n, arrNumber) != -1) {
            int index = isInArray(n, arrNumber);
            deleteElementInArray(index, arrNumber);
        } else {
            System.out.println("Số bạn nhập vào không có trong mảng!");
            System.exit(0);
        }
        System.out.println("Mảng sau khi xoá: " + Arrays.toString(arrNumber));
    }
    // Kiểm tra phần tử có trong mảng
    public static int isInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }
    // Xoá phần tử trong mảng ở vị trí index
    public static void deleteElementInArray(int index, int[] array) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }
}
