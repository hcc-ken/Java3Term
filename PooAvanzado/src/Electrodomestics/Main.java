package Electrodomestics;

public class Main {
    public static void main(String[] args) {
        Electrodomestic iron = new Electrodomestic();
        System.out.println("The iron has a weight of " + iron.getWeight() + " kg, a color of " + iron.getColor() + " and a price of " + iron.getPriceBase() + " euros.");

        WashingMachine washingMachine = new WashingMachine(200, 22);
        System.out.println("The washing machine has a weight of " + washingMachine.getWeight() + " kg, a color of " + washingMachine.getColor() + " and a price of " + washingMachine.getPriceBase() + " euros.");

        Television television = new Television(500, "cyan", 'K', 10, 40, true);
        System.out.println("The television has a weight of " + television.getWeight() + " kg, a color of " + television.getColor() + " an energetic consumption of " + television.getEnergeticConsumption() + " and a price of " + television.getPriceBase() + " euros.");
    }
}