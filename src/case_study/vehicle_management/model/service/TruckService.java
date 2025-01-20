package case_study.vehicle_management.model.service;

import case_study.vehicle_management.model.object.Truck;
import case_study.vehicle_management.model.object.Vehicle;
import case_study.vehicle_management.utils.FileHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TruckService implements VehicleService {
    private final String TRUCK_FILE = "src/case_study/vehicle_management/data/Truck.csv";

    public List<Vehicle> displayVehicle() {
        List<Vehicle> truckList = new ArrayList<>();
        List<String> lines = FileHandler.readFile(TRUCK_FILE);
        for (String line : lines) {
            String[] parts = line.split(",");
            Truck truck = new Truck(parts[0], parts[1],
                    Integer.parseInt(parts[2]), parts[3], Double.parseDouble(parts[4]));
            truckList.add(truck);
        }
        for (Vehicle truck : truckList) {
            System.out.println(truck);
        }
        return truckList;
    }

    public void addVehicle(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInforToFile());
        FileHandler.writeFile(TRUCK_FILE, stringList, true);
    }

    public boolean deleteVehicle(String registryNumber) {
        List<Vehicle> truckList = displayVehicle();
        boolean isDeleted = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (Objects.equals(registryNumber, truckList.get(i).getRegistryNumber())) {
                isDeleted = true;
                truckList.remove(i);
                break;
            }
        }
        if (isDeleted) {
            List<String> stringList = new ArrayList<>();
            for (Vehicle truck : truckList) {
                stringList.add(truck.getInforToFile());
            }
            FileHandler.writeFile(TRUCK_FILE, stringList, false);
        }
        return isDeleted;
    }
}
