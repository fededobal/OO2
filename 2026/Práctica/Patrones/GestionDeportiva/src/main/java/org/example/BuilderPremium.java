package org.example;

public class BuilderPremium extends Builder {

    @Override
    public Builder buildRutina() {
        getPerfilSocio().setTipoRutina("Personalizada con seguimiento");
        return this;
    }

    @Override
    public Builder buildNivelAcceso() {
        getPerfilSocio().setNivelAcceso("Acceso Total 24/7");
        return this;
    }
}
