package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
        return this.posteos.stream().filter(p -> !p.estaEliminado()).collect(Collectors.toList());
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
