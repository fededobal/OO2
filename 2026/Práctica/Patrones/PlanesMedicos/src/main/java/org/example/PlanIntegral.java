package org.example;

public class PlanIntegral extends PlanMedico {
    static final int MONTO_FIJO = 22000;

    @Override
    protected double seguroInternacion() {
        return MONTO_FIJO * 0.05;
    }

    @Override
    protected double costoCoberturaViajera(Afiliado afiliado) {
        double costo =
                afiliado.getSalario() * 0.03
                - 10000 * afiliado.antiguedadCoseguro();
        return Math.max(0, costo);
    }

    @Override
    protected double cargoGrupoFamiliar(Afiliado afiliado) {
        return 3000 * afiliado.getFamiliaresACargo()
                + afiliado.getSalario() * 0.01;
    }

    @Override
    protected double getMontoFijo(Afiliado afiliado) {
        return MONTO_FIJO;
    }
}
