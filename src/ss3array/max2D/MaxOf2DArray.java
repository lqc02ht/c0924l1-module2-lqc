package ss3array.max2D;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOf2DArray {
    public static void main(String[] args) {
        // khởi tạo và nhập mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng hàng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][]array2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ":");
                array2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        // tìm số lớn nhất
        int max = array2D[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < array2D[i][j]) {
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Mảng 2 chiều: " + Arrays.deepToString(array2D));
        System.out.println("Số lớn nhất trong mảng 2 chiều: " + max);
    }
}
