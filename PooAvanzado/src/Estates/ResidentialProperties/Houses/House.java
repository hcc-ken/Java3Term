package Estates.ResidentialProperties.Houses;

import Estates.ResidentialProperties.ResidentialProperty;

public class House extends ResidentialProperty {
    protected int numberOfFloors;

    public House() {
        super();
        numberOfFloors = 0;
    }

    public House(int identifier, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(identifier, area, address, numberOfRooms, numberOfBathrooms);
        this.numberOfFloors = numberOfFloors;
    }
}
