package org.example;
public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }
    public int getAltura() {
        return this.altura;
    }

    public double calcularArea() {
        return (double) (this.altura * this.base) / 2;
    }
}