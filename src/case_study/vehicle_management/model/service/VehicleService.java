package case_study.vehicle_management.model.service;

import case_study.vehicle_management.model.object.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> displayVehicle();

    void addVehicle(Vehicle vehicle);

    boolean deleteVehicle(String registryNumber);
//    boolean updateVehicle();
}
