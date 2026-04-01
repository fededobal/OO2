package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class CarRental extends Product {
    private double cost;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);
        this.cost = cost;
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public double price() {
        return this.company.finalPrice();
    }

    public double cost() {
        return this.cost;
    }
}
