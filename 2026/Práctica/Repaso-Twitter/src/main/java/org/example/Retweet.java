package org.example;

public class Retweet extends Posteo {
    private Posteo origen;

    public Retweet(Posteo p) {
        this.origen = p;
        this.origen.agregarRT(this);
    }

    public String getTexto() {
        return this.origen.getTexto();
    }
}
