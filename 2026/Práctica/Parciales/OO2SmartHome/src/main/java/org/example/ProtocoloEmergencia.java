package org.example;

public abstract class ProtocoloEmergencia {
    public void activarEmergencia() {
        this.alarmas();
        System.out.println("Puertas desbloqueadas");
        this.autoridades();
        this.contramedidas();
    }

    public abstract void alarmas();
    public abstract void autoridades();
    public void contramedidas() {

    }
}
