package org.example;

public class CamarasCliente {
    private ProxyCamaras camaras;
    private int rol;

    public CamarasCliente(int rol) {
        this.camaras = new ProxyCamaras(rol);
        this.rol = rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public void verCamaras() {
        this.camaras.ver();
    }
}
