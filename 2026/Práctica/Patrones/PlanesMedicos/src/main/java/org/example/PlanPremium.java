package org.example;

public class PlanPremium extends PlanMedico {
    static final int MONTO_FIJO = 33000;


    @Override
    protected double seguroInternacion() {
        return MONTO_FIJO * 0.05;
    }

    @Override
    protected double costoCoberturaViajera(Afiliado afiliado) {
        return afiliado.getSalario() * 0.01
                - afiliado.coberturaViajesCoseguro();
    }

    @Override
    protected double cargoGrupoFamiliar(Afiliado afiliado) {
        return afiliado.getFamiliaresACargo() <= 4
                ? 0
                : 2800 * (afiliado.getFamiliaresACargo() - 4);
    }

    @Override
    protected double getMontoFijo(Afiliado afiliado) {
        return MONTO_FIJO - afiliado.descuentoCoseguro();
    }
}
