package org.example;

public class EstadoDefinitiva implements ExcursionEstado {

    @Override
    public String obtenerInformacion(Excursion e) {
        return String.format("%s; Emails de los usuarios inscriptos: %s; Usuarios faltantes para alcanzar el cupo máximo: %d",e.getInformacionBasica(),e.getUsuariosEmails(),e.getUsuariosFaltantesCupoMax());
    }

    @Override
    public void inscribir(Excursion e, Usuario unUsuario) {
        e.inscribirUsuario(unUsuario);
        if(e.getCantidadInscriptos() >= e.getCupoMax()) {
            e.setExcursionEstado(new EstadoCupoMax());
        }
    }
}
