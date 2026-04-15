package Estates.ResidentialProperties;

import Estates.Estate;

public class ResidentialProperty extends Estate {
    protected int numberOfRooms;
    protected int numberOfBathrooms;

    public ResidentialProperty(){
        super();
        numberOfRooms = 0;
        numberOfBathrooms = 0;
    }

    public ResidentialProperty(int identifier, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(identifier, area, address);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
}
