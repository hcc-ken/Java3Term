package Estates.ResidentialProperties.Houses.Urbans;

import Estates.ResidentialProperties.Houses.House;

public class Urban extends House {
    public Urban() {
        super();
    }

    public Urban(int identifier, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(identifier, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
    }
}
