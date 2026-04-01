package ar.edu.info.unlp.refactoring.ejercicio1;

public class Hotel {
    private double nightPrice;
    private double discountRate;

    public Hotel(double nightPrice, double discountRate) {
        this.nightPrice = nightPrice;
        this.discountRate = discountRate;
    }

    private double nightPrice() {
        return this.nightPrice;
    }

    private double discountRate() {
        return this.discountRate;
    }

    public double finalPrice(long period) {
        return period * this.nightPrice() * this.discountRate();
    }
}
