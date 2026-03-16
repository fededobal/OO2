package org.example;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Posteo> posteos;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.posteos = new LinkedList<>();
    }

    public boolean twittear(String texto) {
        if(this.validarTexto(texto)) {
            this.posteos.add(new Tweet(texto));
            return true;
        }
        return false;
    }

    public void retwittear(Posteo p) {
        this.posteos.add(new Retweet(p));
    }

    public List<Posteo> getPosteosValidos() {
        List<Posteo> validos = new LinkedList<>();
        for (Posteo p : this.posteos)
            if (!p.estaEliminado())
                validos.add(p);
        return validos;
    }

    public String getScreenName() {
        return this.screenName;
    }

    private boolean validarTexto(String texto) {
        return !texto.isEmpty() && texto.length() <= 280;
    }

    public void eliminarPosteos() {
        this.posteos.clear();
    }
}
