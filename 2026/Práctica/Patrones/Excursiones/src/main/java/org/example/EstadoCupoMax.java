package org.example;

public class EstadoCupoMax implements ExcursionEstado {

    @Override
    public String obtenerInformacion(Excursion e) {
        return String.format(e.getInformacionBasica());
    }

    @Override
    public void inscribir(Excursion e, Usuario unUsuario) {
        e.agregarUsuarioEspera(unUsuario);
    }
}
