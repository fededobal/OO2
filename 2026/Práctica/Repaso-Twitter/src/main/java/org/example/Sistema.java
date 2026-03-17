package org.example;

import java.util.LinkedList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new LinkedList<>();
    }

    public boolean agregarUsuario(Usuario u) {
        if(buscarPorScreenName(u.getScreenName()) == null) {
            this.usuarios.add(u);
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario(String screenName) {
        Usuario u = buscarPorScreenName(screenName);
        if(u != null) {
            for(Posteo p : u.getPosteosValidos())
                p.eliminarRetweets();
            this.usuarios.remove(u);
            return true;
        }
        return false;
    }

    private Usuario buscarPorScreenName(String screenName) {
        return this.usuarios.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
    }
}
