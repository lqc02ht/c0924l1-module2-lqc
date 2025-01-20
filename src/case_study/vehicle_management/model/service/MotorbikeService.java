package case_study.vehicle_management.model.service;

import case_study.vehicle_management.model.object.Motorbike;
import case_study.vehicle_management.model.object.Vehicle;
import case_study.vehicle_management.utils.FileHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MotorbikeService implements VehicleService {
    private final String MOTORBIKE_FILE = "src/case_study/vehicle_management/data/Motorbike.csv";

    public List<Vehicle> displayVehicle() {
        List<Vehicle> motorbikeList = new ArrayList<>();
        List<String> lines = FileHandler.readFile(MOTORBIKE_FILE);
        for (String line : lines) {
            String[] parts = line.split(",");
            Motorbike motorbike = new Motorbike(parts[0], parts[1],
                    Integer.parseInt(parts[2]), parts[3], Double.parseDouble(parts[4]));
            motorbikeList.add(motorbike);
        }
        for (Vehicle motorbike : motorbikeList) {
            System.out.println(motorbike);
        }
        return motorbikeList;
    }

    public void addVehicle(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInfoToFile());
        FileHandler.writeFile(MOTORBIKE_FILE, stringList, true);
    }

    public boolean deleteVehicle(String registryNumber) {
        List<Vehicle> motorbikeList = displayVehicle();
        boolean isDeleted = false;
        for (int i = 0; i < motorbikeList.size(); i++) {
            if (Objects.equals(registryNumber, motorbikeList.get(i).getRegistryNumber())) {
                isDeleted = true;
                motorbikeList.remove(i);
                break;
            }
        }
        if (isDeleted) {
            List<String> stringList = new ArrayList<>();
            for (Vehicle motorbike : motorbikeList) {
                stringList.add(motorbike.getInfoToFile());
            }
            FileHandler.writeFile(MOTORBIKE_FILE, stringList, false);
        }
        return isDeleted;
    }
}
