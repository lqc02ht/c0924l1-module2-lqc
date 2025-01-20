package case_study.vehicle_management.view;

import case_study.vehicle_management.controller.VehicleController;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleController vehicleController = new VehicleController();
        while (true) {
            System.out.println("------------ CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ------------");
            System.out.println("1. Xem danh sách phương tiện");
            System.out.println("2. Thêm mới phương tiện");
            System.out.println("3. Xoá phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleController.display();
                    break;
                case 2:
                    vehicleController.add();
                    break;
                case 3:
                    vehicleController.delete();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        }

    }
}
