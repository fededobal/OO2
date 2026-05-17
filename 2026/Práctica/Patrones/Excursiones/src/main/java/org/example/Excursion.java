package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio, fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMin, cupoMax;
    private ExcursionEstado excursionEstado;
    private List<Usuario> inscriptos = new ArrayList<>();
    private Queue<Usuario> listaEspera = new LinkedList<>();

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
                     String puntoEncuentro, double costo, int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.excursionEstado = new EstadoProvisoria();
    }

    public void setExcursionEstado(ExcursionEstado excursionEstado) {
        this.excursionEstado = excursionEstado;
    }

    public String getInformacionBasica() {
        return String.format("Nombre: %s; Costo: %f; Fecha de inicio: %s; Fecha de fin: %s; Punto de encuentro: %s;",getNombre(),getCosto(),getFechaInicio(),getFechaFin(),getPuntoEncuentro());
    }

    public int getCantidadInscriptos() {
        return inscriptos.size();
    }

    public int getCantidadEspera() {
        return listaEspera.size();
    }

    public int getCupoMin() {
        return cupoMin;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public String obtenerInformacion() {
        return excursionEstado.obtenerInformacion(this);
    }

    public void inscribir(Usuario unUsuario) {
        excursionEstado.inscribir(this, unUsuario);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public int getUsuariosFaltantesCupoMin() {
        if(this.listaEspera.size() < this.cupoMin)
            return this.cupoMin - this.listaEspera.size();
        return 0;
    }

    public int getUsuariosFaltantesCupoMax() {
        if(this.listaEspera.size() < this.cupoMax)
            return this.cupoMax - this.listaEspera.size();
        return 0;
    }

    public void agregarUsuarioEspera(Usuario unUsuario) {
        this.listaEspera.add(unUsuario);
    }

    public void inscribirUsuario(Usuario unUsuario) {
        this.inscriptos.add(unUsuario);
    }

    public String getUsuariosEmails() {
        return this.listaEspera.stream().map(Usuario::getEmail).collect(Collectors.joining(","));
    }
}
