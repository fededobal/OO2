package org.example;

import java.util.LinkedList;
import java.util.List;

public abstract class Posteo {
    private List<Retweet> retweets;
    private boolean eliminado;

    public Posteo() {
        this.retweets = new LinkedList<>();
    }

    public void eliminarRetweets() {
        this.eliminado = true;
        for (Retweet rt : retweets)
            rt.eliminarRetweets();
    }

    public boolean estaEliminado() {
        return this.eliminado;
    }

    public abstract String getTexto();

    public void agregarRT(Retweet retweet) {
        this.retweets.add(retweet);
    }
}
