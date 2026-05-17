package org.example;

public class EstadoProvisoria implements ExcursionEstado {

    @Override
    public String obtenerInformacion(Excursion e) {
        return String.format("%s; Usuarios faltantes para alcanzar el cupo mínimo: %d",e.getInformacionBasica(),e.getUsuariosFaltantesCupoMin());
    }

    @Override
    public void inscribir(Excursion e, Usuario unUsuario) {
        e.inscribirUsuario(unUsuario);
        if(e.getCantidadInscriptos() >= e.getCupoMin()) {
            e.setExcursionEstado(new EstadoDefinitiva());
        }
    }
}
