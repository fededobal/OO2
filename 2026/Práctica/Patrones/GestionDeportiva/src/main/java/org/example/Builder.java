package org.example;

public abstract class Builder {
    private PerfilSocio perfilSocio;

    public Builder() {
        this.perfilSocio = new PerfilSocio();
    }

    abstract Builder buildRutina();
    abstract Builder buildNivelAcceso();

    protected PerfilSocio getPerfilSocio() {
        return perfilSocio;
    }

    public Builder buildNombre(String nombre) {
        getPerfilSocio().setNombre(nombre);
        return this;
    }

    public PerfilSocio construir() {
        return this.perfilSocio;
    }
}
