package org.example;

public class Calculadora {
    private Estado estado;
    private double valorAcumulado;
    private Operacion operacion;
    private double valorNuevo;

    public Calculadora() {
        this.borrar();
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }
    public Estado getEstado() {
        return this.estado;
    }
    public double getValorAcumulado() {
        return this.valorAcumulado;
    }
    public void setValorAcumulado(double unValor) {
        this.valorAcumulado = unValor;
    }
    public void setValorNuevo(double unValor) {
        this.valorNuevo = unValor;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Devuelve el resultado actual de la operación realizada.
     * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
     * Si la calculadora se encuentra en error, devuelve “error”
     */
    public String resultado() {
        return this.estado.getResultado(this);
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
        this.cambiarEstado(new EstadoInicial(this));
        this.valorAcumulado = 0;
    }


    /**
     * Asigna un valor para operar.
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {

        this.estado.setValor(this,unValor);
    }

    /**
     * Indica que la calculadora debe esperar un nuevo valor.
     * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
     * el valor recibido como parámetro, al valor actual y guardará el resultado
     */
    public void mas() {
        this.estado.mas(this);
    }
    public void menos() {
        this.estado.menos(this);
    }
    public void por() {
        this.estado.por(this);
    }
    public void dividido() {
        this.estado.dividido(this);
    }

}
