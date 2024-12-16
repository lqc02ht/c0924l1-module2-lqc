package ss1_introduction.currency;

import java.util.Scanner;

public class ConvertUsdToVnd {
    public static void main(String[] args) {
        final int RATE = 25000;
        System.out.println("Nhập vào giá trị tiền USD($):");
        Scanner scanner = new Scanner(System.in);
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd*RATE;
        System.out.println("Số tiền Việt tương ứng là " + vnd + "đ");
        scanner.close();
    }
}
