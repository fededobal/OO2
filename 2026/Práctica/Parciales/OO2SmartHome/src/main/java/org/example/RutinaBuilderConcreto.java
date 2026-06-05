package org.example;

public class RutinaBuilderConcreto extends RutinaBuilder {
    private Rutina rutina;

    public RutinaBuilderConcreto() {
        this.rutina = new Rutina();
    }

    public RutinaBuilderConcreto setNombre(String nombre) {
        this.rutina.setNombre(nombre);
        return this;
    }

    public RutinaBuilderConcreto setHoraInicio(int horaInicio) {
        this.rutina.setHoraInicio(horaInicio);
        return this;
    }

    public RutinaBuilderConcreto encenderLuz(int luz) {
        this.rutina.encenderLuz(luz);
        return this;
    }

    public RutinaBuilderConcreto abrirPersiana(int persiana) {
        this.rutina.abrirPersiana(persiana);
        return this;
    }

    public RutinaBuilderConcreto setTempAC(int tempAC) {
        this.rutina.setTempAC(tempAC);
        return this;
    }

    public RutinaBuilderConcreto setNivelSeguridad(int nivelSeguridad) {
        this.rutina.setNivelSeguridad(nivelSeguridad);
        return this;
    }

    @Override
    public Rutina construirRutina() {
        return this.rutina;
    }
}
