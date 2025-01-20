package case_study.vehicle_management.model.service;

import case_study.vehicle_management.model.object.Car;
import case_study.vehicle_management.model.object.Vehicle;
import case_study.vehicle_management.utils.FileHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CarService implements VehicleService {
    private final String CAR_FILE = "src/case_study/vehicle_management/data/Car.csv";

    public List<Vehicle> displayVehicle() {
        List<Vehicle> carList = new ArrayList<>();
        List<String> lines = FileHandler.readFile(CAR_FILE);
        for (String line : lines) {
            String[] parts = line.split(",");
            Car car = new Car(parts[0], parts[1],
                    Integer.parseInt(parts[2]), parts[3], Integer.parseInt(parts[4]), parts[5]);
            carList.add(car);
        }
        for (Vehicle car : carList) {
            System.out.println(car);
        }
        return carList;
    }

    public void addVehicle(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInfoToFile());
        FileHandler.writeFile(CAR_FILE, stringList, true);
    }

    public boolean deleteVehicle(String registryNumber) {
        List<Vehicle> carList = displayVehicle();
        boolean isDeleted = false;
        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(registryNumber, carList.get(i).getRegistryNumber())) {
                while (true) {
                    System.out.println("Bạn có muốn xoá phương tiện này khỏi danh sách không?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    try {
                        Scanner scanner = new Scanner(System.in);
                        int choice = Integer.parseInt(scanner.nextLine());
                        if (choice == 1) {
                            isDeleted = true;
                            carList.remove(i);
                            break;
                        } else if (choice == 2) {
                            return isDeleted;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập đúng số!");
                    }
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại!");
                }
            }
        }
        if (isDeleted) {
            List<String> stringList = new ArrayList<>();
            for (Vehicle car : carList) {
                stringList.add(car.getInfoToFile());
            }
            FileHandler.writeFile(CAR_FILE, stringList, false);
        }
        return isDeleted;
    }
}
