package Estates.ResidentialProperties.Apartments.Studios;

import Estates.ResidentialProperties.Apartments.Apartment;

public class Studio extends Apartment {
    public Studio() {
        super();
    }

    public Studio(int identifier, int area, String address, int administrationValue) { // Numbers of rooms are not necessary since it'll always be 1, as it is for bathroom.
        super(identifier, area, address, 1, 1, administrationValue);
    }
    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Studio.");
        return 1500 * area;
    }

}
