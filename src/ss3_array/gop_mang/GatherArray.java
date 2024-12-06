package ss3_array.gop_mang;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GatherArray {
    public static void main(String[] args) {
        // Tạo và nhập mảng 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên N(số lượng phần tử của mảng 1):");
        int N = Integer.parseInt(scanner.nextLine());
        int[]arrNumber1 = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arrNumber1[i] = Integer.parseInt(scanner.nextLine());
        }
        // Tạo và nhập mảng 2
        System.out.println("Nhập vào số nguyên M(số lượng phần tử của mảng 2):");
        int M = Integer.parseInt(scanner.nextLine());
        int[]arrNumber2 = new int[M];
        for (int i = 0; i < M; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arrNumber2[i] = Integer.parseInt(scanner.nextLine());
        }
        // Tạo và gộp mảng 1, 2 thành mảng mới
        int[]arrNumber3 = new int[M + N];
        for (int i = 0; i < arrNumber1.length; i++) {
            arrNumber3[i] = arrNumber1[i];
        }
        for (int i = arrNumber1.length; i < arrNumber3.length; i++) {
            arrNumber3[i] = arrNumber2[i - arrNumber1.length];
        }
        System.out.print("Mảng gộp của 2 mảng vừa nhập vào: " + Arrays.toString(arrNumber3));
    }
}
