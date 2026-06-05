package org.example;

public class Automovil extends Prenda {
    private int antiguedad;
    private double costo;
    private String modelo;
    private double kilometraje;

    public Automovil(int antiguedad, double costo, String modelo, double kilometraje) {
        this.antiguedad = antiguedad;
        this.costo = costo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    @Override
    protected double getLiquidez() {
        return 0.7;
    }

    @Override
    protected double getValor() {
        return this.costo - this.costo * antiguedad * 0.1;
    }
}
