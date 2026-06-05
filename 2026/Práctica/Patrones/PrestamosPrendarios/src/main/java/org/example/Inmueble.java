package org.example;

public class Inmueble extends Prenda {
    private double superficie;
    private double costoM2;
    private String direccion;

    public Inmueble(double superficie, double costoM2, String direccion) {
        this.superficie = superficie;
        this.costoM2 = costoM2;
        this.direccion = direccion;
    }

    @Override
    protected double getLiquidez() {
        return 0.2;
    }

    @Override
    protected double getValor() {
        return this.superficie * this.costoM2;
    }
}
