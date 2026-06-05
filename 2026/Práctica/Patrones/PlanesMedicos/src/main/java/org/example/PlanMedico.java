package org.example;

import java.time.LocalDate;

public abstract class PlanMedico {
    private LocalDate fechaContratacion;

    public LocalDate getFechaContratacion() {
        return this.fechaContratacion;
    }


    public double calcularMonto(Afiliado afiliado) {
        return this.getMontoFijo(afiliado)
                + this.cargoGrupoFamiliar(afiliado)
                + this.costoCoberturaViajera(afiliado)
                + this.seguroInternacion();
    }

    protected abstract double seguroInternacion();
    protected abstract double costoCoberturaViajera(Afiliado afiliado);
    protected abstract double cargoGrupoFamiliar(Afiliado afiliado);
    protected abstract double getMontoFijo(Afiliado afiliado);

}
