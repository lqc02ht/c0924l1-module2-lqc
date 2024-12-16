package ss2_loop.shapes;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                Menu:
                1. Print the rectangle
                2. Print the square triangle
                3. Print isosceles triangle
                4. Exit""");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter length of rectangle:");
                    int lengthRec = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter width of rectangle:");
                    int widthRec = Integer.parseInt(scanner.nextLine());
                    String shapes = "";
                    for (int i = 0; i < widthRec; i++) {
                        for (int j = 0; j < lengthRec; j++) {
                            shapes += "* ";
                        }
                        shapes += '\n';
                    }
                    System.out.println(shapes);
                    break;
                case 2:
                    System.out.println("The corner is square at (top-left, top-right, botton-left, botton-right):");
                    String corner = scanner.nextLine();
                    switch (corner) {
                        case "top-left":
                            System.out.println("Enter height of triangle:");
                            int height1 = Integer.parseInt(scanner.nextLine());
                            String triangle1 = "";
                            for (int i = height1; i > 0; i--) {
                                for (int j = 1; j <= i; j++) {
                                    triangle1 += "* ";
                                }
                                triangle1 += '\n';
                            }
                            System.out.println(triangle1);
                            break;
                        case "top-right":
                            System.out.println("Enter height of triangle:");
                            int height2 = Integer.parseInt(scanner.nextLine());
                            String triangle2 = "";
                            for (int i = height2; i > 0; i--) {
                                for (int j = 0; j < height2 - i; j++) {
                                    triangle2 += "  ";
                                }
                                for (int k = 0; k < i; k++) {
                                    triangle2 += "* ";
                                }
                                triangle2 += '\n';
                            }
                            System.out.println(triangle2);
                            break;
                        case "botton-left":
                            System.out.println("Enter height of triangle:");
                            int height3 = Integer.parseInt(scanner.nextLine());
                            String triangle3 = "";
                            for (int i = 0; i < height3; i++) {
                                for (int j = 0; j <= i; j++) {
                                    triangle3 += "* ";
                                }
                                triangle3 += '\n';
                            }
                            System.out.println(triangle3);
                            break;
                        case "botton-right":
                            System.out.println("Enter height of triangle:");
                            int height4 = Integer.parseInt(scanner.nextLine());
                            String triangle4 = "";
                            for (int i = 0; i < height4; i++) {
                                for (int j = 0; j < height4 - 1 - i; j++) {
                                    triangle4 += "  ";
                                }
                                for (int k = 0; k <= i; k++) {
                                    triangle4 += "* ";
                                }
                                triangle4 += '\n';
                            }
                            System.out.println(triangle4);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter height of triangle:");
                    int height5 = Integer.parseInt(scanner.nextLine());
                    String triangle5 = "";
                    for (int i = 0; i < height5; i++) {
                        for (int j = 0; j < height5 - 1 - i; j++) {
                            triangle5 += ' ';
                        }
                        for (int k = 0; k <= i; k++) {
                            triangle5 += "* ";
                        }
                        triangle5 += '\n';
                    }
                    System.out.println(triangle5);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
