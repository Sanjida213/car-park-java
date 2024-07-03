package org.example;

import org.example.vehicles.Vehicle;

public class ParkingSpot {
    private Vehicle vehicle;
    private ParkingSpotType type;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case MOTORCYCLE:
                return true;
            case CAR:
                return type == ParkingSpotType.COMPACT || type == ParkingSpotType.LARGE;
            case VAN:
                return type == ParkingSpotType.LARGE;
        }
        return false;
    }

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public ParkingSpotType getType() {
        return type;
    }
}

