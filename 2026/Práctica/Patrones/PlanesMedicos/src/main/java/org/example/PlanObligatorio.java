package org.example;

public class PlanObligatorio extends PlanMedico {
    static final int MONTO_FIJO = 15000;

    @Override
    protected double seguroInternacion() {
        return 0;
    }

    @Override
    protected double costoCoberturaViajera(Afiliado afiliado) {
        return afiliado.getSalario() * 0.01
                - afiliado.coberturaViajesCoseguro();
    }

    @Override
    protected double cargoGrupoFamiliar(Afiliado afiliado) {
        return afiliado.getFamiliaresACargo() * 3500
                - afiliado.descuentoCoseguro() * afiliado.getFamiliaresACargo();
    }

    @Override
    protected double getMontoFijo(Afiliado afiliado) {
        return MONTO_FIJO;
    }
}
