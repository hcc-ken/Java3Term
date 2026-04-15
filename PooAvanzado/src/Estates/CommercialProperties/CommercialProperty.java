package Estates.CommercialProperties;

import Estates.Estate;

public class CommercialProperty extends Estate {
    protected boolean locationExterior;

    public CommercialProperty() {
        super();
        locationExterior = false;
    }

    public CommercialProperty(int identifier, int area, String address, boolean locationExterior) {
        super(identifier, area, address);
        this.locationExterior = locationExterior;
    }

    public boolean isLocationExterior() {
        return locationExterior;
    }
}
