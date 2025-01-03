package ss15_exception.triangle_exception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh thứ hai: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh thứ ba: ");
            double c = Double.parseDouble(scanner.nextLine());
            validateTriangle(a, b, c);
            System.out.println("Ba cạnh của tam giác hợp lệ.");
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số hợp lệ.");
        }
    }

    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Cạnh của tam giác phải là số dương.");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }
}
