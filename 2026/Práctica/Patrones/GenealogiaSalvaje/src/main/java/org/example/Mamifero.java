package org.example;
import java.util.Date;

public class Mamifero {
    private String identificador;
    private String especie;
    private Date fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(String identificador, String especie, Date fechaNacimiento) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.padre = new NullMamifero();
        this.madre = new NullMamifero();
    }

    protected Mamifero() {}

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String id) {
        this.identificador = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fecha) {
        this.fechaNacimiento = fecha;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno() {
        return this.madre.getPadre();
    }

    public Mamifero getAbuelaMaterna() {
        return this.madre.getMadre();
    }

    public Mamifero getAbueloPaterno() {
        return this.padre.getPadre();
    }

    public Mamifero getAbuelaPaterna() {
        return this.padre.getMadre();
    }

    public Boolean tieneComoAncestroA(Mamifero unMamifero) {
        boolean ancestroPorParteDePadre = false;
        boolean ancestroPorParteDeMadre = false;

        if (this.padre.equals(unMamifero)) {
            return true;
        } else {
            ancestroPorParteDePadre = this.padre.tieneComoAncestroA(unMamifero);
        }

        if (this.madre.equals(unMamifero)) {
            return true;
        } else {
            ancestroPorParteDeMadre = this.madre.tieneComoAncestroA(unMamifero);
        }

        return ancestroPorParteDePadre || ancestroPorParteDeMadre;
    }
}