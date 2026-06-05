package org.example;

public class CamaraFisica extends SujetoCamaras {
    private String nombre;
    private String ubicacion;

    public CamaraFisica(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public void ver() {
        System.out.println("Mostrando video de la camara");
    }
}
