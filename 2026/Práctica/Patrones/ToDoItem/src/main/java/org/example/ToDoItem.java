package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
    List<String> comentarios;
    private Estado estado;
    private String name;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    /**
     * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
     */
    public ToDoItem(String name) {
        this.name = name;
        this.estado = new Pending();
        this.comentarios = new LinkedList<>();
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start() {
        this.estado.start(this);
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí * su estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause() {
        this.estado.togglePause(this);
    }


    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish() {
        this.estado.finish(this);
    }


    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return this.estado.workedTime(this);
    }


    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void agregarComentario(String comment) {
        this.estado.agregarComentario(this,comment);
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setState(Estado estado) {
        this.estado = estado;
    }

    public List<String> getComentarios() {
        return this.comentarios;
    }
}