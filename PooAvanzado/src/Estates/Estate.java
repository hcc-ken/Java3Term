package Estates;

public class Estate {
    protected int identifier;
    protected int area;
    protected String address;

    public Estate() {
        identifier = 0;
        area = 0;
        address = "";
    }

    public Estate(int identifier, int area, String address) {
        this.identifier = identifier;
        this.area = area;
        this.address = address;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public int obtainPurchaseValue() {
        return 0;
    }
}
