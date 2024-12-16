package ss4_oop.equation;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hệ số c: ");
        double c = Double.parseDouble(scanner.nextLine());
        // Tạo đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();
        // Kiểm tra và hiển thị kết quả
        if (discriminant > 0) {
            System.out.println("Phương trình có hai nghiệm: " + equation.getRoot1() + " và " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("Phương trình có nghiệm kép: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
