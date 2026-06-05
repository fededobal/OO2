package org.patrones;

public class Paquete implements IPaquete {
    private String descripcion;
    private String destinatario;
    private String direccionDestino;
    private double valorDeclarado;

    public Paquete(String descripcion, String destinatario, String direccionDestino, double valorDeclarado) {
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccionDestino = direccionDestino;
        this.valorDeclarado = valorDeclarado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public double getCostoEnvio() {
        return this.valorDeclarado * 0.05;
    }
}
