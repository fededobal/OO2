package org.example;

import java.util.HashSet;
import java.util.Set;

public class Personaje {
    private String nombre;
    private Armadura armadura;
    private Arma arma;
    private int vida;
    private Set<String> habilidades;

    public Personaje(String nombre, Armadura armadura, Arma arma) {
        this.nombre = nombre;
        this.armadura = armadura;
        this.arma = arma;
        this.vida = 100;
        this.habilidades = new HashSet<>();
    }

    public void recibirDaño(int daño) {
        this.vida = Math.max(0,this.vida - daño);
    }

    public boolean vivo() {
        return vida > 0;
    }

    public void atacar(Personaje personaje) {
        if(this.vivo() && personaje.vivo()) {
            int daño = personaje.defenderContra(this.arma);
            personaje.recibirDaño(daño);
        }
    }

    public int defenderContra(Arma arma) {
       return this.armadura.defenderContra(arma);
    }

    public void agregarHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }
}
