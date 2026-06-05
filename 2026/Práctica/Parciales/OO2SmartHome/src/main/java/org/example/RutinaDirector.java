package org.example;

public class RutinaDirector {
    public Rutina construirRutinaNoche() {
        return new RutinaBuilderConcreto()
                .setNombre("Modo noche")
                .setHoraInicio(20)
                .encenderLuz(1)
                .encenderLuz(2)
                .encenderLuz(3)
                .setTempAC(28)
                .setNivelSeguridad(1)
                .construirRutina();
    }

    public Rutina construirRutinaDia() {
        return new RutinaBuilderConcreto()
                .setNombre("Modo dia")
                .setHoraInicio(7)
                .encenderLuz(1)
                .setTempAC(24)
                .setNivelSeguridad(2)
                .construirRutina();
    }
}
