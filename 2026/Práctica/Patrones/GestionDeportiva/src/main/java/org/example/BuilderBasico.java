package org.example;

public class BuilderBasico extends Builder {

    @Override
    public Builder buildRutina() {
        getPerfilSocio().setTipoRutina("Estandar general");
        return this;
    }

    @Override
    public Builder buildNivelAcceso() {
        getPerfilSocio().setNivelAcceso("Lunes a Viernes (8 a 20hs)");
        return this;
    }
}
