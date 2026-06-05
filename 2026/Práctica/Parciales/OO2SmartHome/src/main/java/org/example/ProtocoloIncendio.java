package org.example;

public abstract class ProtocoloIncendio extends ProtocoloEmergencia {
    public void alarmas() {
        System.out.println("Haciendo sonar alarma continuamente...");
    }
    public void autoridades() {
        System.out.println("Llamando a los bomberos...");
    }
    public void contramedidas() {
        System.out.println("Rociadores de agua activados");
    }
}
