package Estates;

import Estates.CommercialProperties.Commericals.Commercial;
import Estates.CommercialProperties.Offices.Office;
import Estates.ResidentialProperties.Apartments.Families.Family;
import Estates.ResidentialProperties.Apartments.Studios.Studio;
import Estates.ResidentialProperties.Houses.Rurals.Rural;
import Estates.ResidentialProperties.Houses.Urbans.Gates.Gate;
import Estates.ResidentialProperties.Houses.Urbans.Independant;

public class Main {
    public static void main (String [] args) {
        int value;
        Estate [] estates = new Estate[7];
        estates [0] = new Rural(); // esto es un upcasting. Metiendo en
        estates [1] = new Gate();
        estates [2] = new Independant();
        estates [3] = new Studio();
        estates [4] = new Family();
        estates [5] = new Commercial();
        estates [6] = new Office();

        for (int i = 0; i < estates.length; i++) {
            value = estates [i].obtainPurchaseValue();
        }
    }
}
