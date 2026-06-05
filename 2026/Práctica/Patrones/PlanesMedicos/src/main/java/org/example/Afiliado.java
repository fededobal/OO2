package org.example;

import java.time.LocalDate;

public class Afiliado {
    private String nombre;
    private int familiaresACargo;
    private double salario;
    private LocalDate fechaNacimiento;
    private PlanMedico plan;
    private Coseguro coseguro;

    public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, PlanMedico plan, Coseguro coseguro) {
        this.nombre = nombre;
        this.familiaresACargo = familiaresACargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.plan = plan;
        this.coseguro = new NullCoseguro();
    }

    public double calcularMonto() {
        return plan.calcularMonto(this);
    }

    public void setPlanMedico(PlanMedico planMedico) {
        this.plan = planMedico;
    }

    public void setCoseguro(Coseguro coseguro) {
        this.coseguro = coseguro;
    }

    public int getFamiliaresACargo() {
        return familiaresACargo;
    }

    public double getSalario() {
        return salario;
    }

    public double coberturaViajesCoseguro() {
        return coseguro.getMontoCoberturaViajes();
    }

    public double descuentoCoseguro() {
        return coseguro.getDescuento();
    }

    public int antiguedadCoseguro() {
        return coseguro.getAntiguedad();
    }
}
