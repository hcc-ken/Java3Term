package Estates.ResidentialProperties.Apartments.Families;

import Estates.ResidentialProperties.Apartments.Apartment;

public class Family extends Apartment {
    public Family(){
        super();
    }

    public Family(int identifier, int area, String address, int numberOfRooms, int numbersOfBathrooms, int administrationValue ){
        super(identifier, area, address, numberOfRooms, numbersOfBathrooms, administrationValue);
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Family.");
        return 2000 * area;
    }
}
