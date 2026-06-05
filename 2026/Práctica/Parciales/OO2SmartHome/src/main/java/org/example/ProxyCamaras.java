package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProxyCamaras extends SujetoCamaras {
    private List<CamaraFisica> camarasFisicas;
    private int rolActual;

    public ProxyCamaras(int rolActual) {
        this.camarasFisicas = new LinkedList<>();
        this.rolActual = rolActual;
    }

    public void agregarCamara(CamaraFisica camaraFisica) {
        this.camarasFisicas.add(camaraFisica);
    }

    public void setRolActual(int rolActual) {
        this.rolActual = rolActual;
    }

    @Override
    public void ver() {
        System.out.println("Nombres de las camaras: " + this.camarasFisicas.stream().map(CamaraFisica::getNombre).collect(Collectors.joining(",")));
        System.out.println("Ubicacion de las camaras: " + this.camarasFisicas.stream().map(CamaraFisica::getUbicacion).collect(Collectors.joining(",")));

        if(this.rolActual == 1) {
            System.out.println("Usted puede ver las camaras: ");
            this.camarasFisicas.forEach(CamaraFisica::ver);
        } else {
            System.out.println("Acceso denegado a las camaras.");
        }
    }
}
