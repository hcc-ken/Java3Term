package Electrodomestics;

public class Television extends Electrodomestic {
    private double resolution;
    private boolean dttTuner;

    public Television() {
        super();
        this.resolution = 20;
        this.dttTuner = false;
    }

    public Television(double priceBase, double weight) {
        super(priceBase, weight);
        this.resolution = 20;
        this.dttTuner = false;
    }

    public Television(double priceBase, String color, char energeticConsumption, double weight, double resolution, boolean dttTuner) {
        super(priceBase, color, energeticConsumption, weight);
        this.resolution = resolution;
        this.dttTuner = dttTuner;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isDttTuner() {
        return dttTuner;
    }

    public void setDttTuner(boolean dttTuner) {
        this.dttTuner = dttTuner;
    }
}
