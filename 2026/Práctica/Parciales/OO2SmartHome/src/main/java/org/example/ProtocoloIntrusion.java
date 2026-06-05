package org.example;

public abstract class ProtocoloIntrusion extends ProtocoloEmergencia {
    public void alarmas() {
        System.out.println("Haciendo sonar alarma intermitentemente...");
    }
    public void autoridades() {
        System.out.println("Llamando a la policia...");
    }
}
