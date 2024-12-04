package ss3_array.chen_phan_tu_mang;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên N(số lượng phần tử của mảng):");
        int N = Integer.parseInt(scanner.nextLine());
        int[]arrNumber = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] newArray = new int[arrNumber.length + 1];
        newArray[newArray.length - 1] = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = arrNumber[i];
        }
        System.out.println("Nhập số nguyên n cần thêm vào mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần thêm vào:");
        int index = Integer.parseInt(scanner.nextLine());
        insertElementAtIndex(n, index, newArray);
        System.out.println("Mảng sau khi xoá: " + Arrays.toString(newArray));
    }
    public static void insertElementAtIndex(int number, int index, int[] newArr) {
        if (index < 0 || index > newArr.length - 1) {
            System.out.println("Chỉ số không đúng!");
        } else {
            for (int i = newArr.length - 1; i > index; i--) {
                newArr[i] = newArr[i - 1];
            }
            newArr[index] = number;
        }
    }
}
