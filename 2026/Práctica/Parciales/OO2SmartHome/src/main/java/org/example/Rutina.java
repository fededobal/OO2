package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private String nombre;
    private int horaInicio;
    private boolean[] luces;
    private boolean[] persianas;
    private int tempAC;
    private int nivelSeguridad;

    public Rutina() {
        this.luces = new boolean[10];
        this.persianas = new boolean[8];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void encenderLuz(int luz) {
        if(luz <= 10)
            this.luces[luz - 1] = true;
    }

    public void abrirPersiana(int persiana) {
        if(persiana <= 8)
            this.persianas[persiana - 1] = true;
    }

    public void setTempAC(int tempAC) {
        this.tempAC = tempAC;
    }

    public void setNivelSeguridad(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }
}
