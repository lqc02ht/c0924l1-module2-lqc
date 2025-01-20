package case_study.vehicle_management.controller;

import case_study.vehicle_management.model.object.*;
import case_study.vehicle_management.model.service.*;
import java.util.Scanner;

public class VehicleController {
    private final VehicleService[] services = {new CarService(),
            new TruckService(), new MotorbikeService()};
    private final Scanner scanner = new Scanner(System.in);

    public void display() {
        while (true) {
            int choice = selectVehicleType("hiển thị");
            if (choice == 4) return;
            VehicleService selectedService = services[choice - 1];
            selectedService.displayVehicle();
        }
    }

    public void add() {
        while (true) {
            int choice = selectVehicleType("thêm");
            if (choice == 4) return;
            VehicleService selectedService = services[choice - 1];
            Vehicle vehicle = inputVehicle(selectedService);
            if (vehicle != null) selectedService.addVehicle(vehicle);
        }
    }

    public void delete() {
        while (true) {
            int choice = selectVehicleType("xóa");
            if (choice == 4) return;
            VehicleService selectedService = services[choice - 1];
            System.out.println("Nhập biển kiểm soát:");
            String registryNumber = scanner.nextLine();
            selectedService.deleteVehicle(registryNumber);
        }
    }

    private int selectVehicleType(String action) {
        while (true) {
            System.out.println("Chọn loại phương tiện cần " + action + ":");
            System.out.println("1. Ô tô");
            System.out.println("2. Xe tải");
            System.out.println("3. Xe máy");
            System.out.println("4. Quay lại menu chính");
            System.out.print("Lựa chọn của bạn: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 4) return choice;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập đúng số!");
            }
            System.out.println("Lựa chọn không hợp lệ. Hãy thử lại!");
        }
    }

    private Vehicle inputVehicle(VehicleService service) {
        System.out.println("Nhập biển kiểm soát:");
        String registryNumber = scanner.nextLine();
        System.out.println("Nhập tên hãng:");
        String automaker = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String owner = scanner.nextLine();
        if (service instanceof CarService) {
            System.out.println("Nhập số chỗ ngồi:");
            int seatAmount = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập kiểu xe:");
            String type = scanner.nextLine();
            return new Car(registryNumber, automaker, year, owner, seatAmount, type);
        } else if (service instanceof TruckService) {
            System.out.println("Nhập số tải trọng:");
            double load = Double.parseDouble(scanner.nextLine());
            return new Truck(registryNumber, automaker, year, owner, load);
        } else if (service instanceof MotorbikeService) {
            System.out.println("Nhập số công suất:");
            double power = Double.parseDouble(scanner.nextLine());
            return new Motorbike(registryNumber, automaker, year, owner, power);
        } else {
            return null;
        }
    }
}
