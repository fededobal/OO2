package org.example;

public class Tweet extends Posteo {
    private String texto;

    public Tweet(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }
}
