package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Estado {
    public void start(ToDoItem toDoItem) {

    }

    public void togglePause(ToDoItem toDoItem) {
        throw new RuntimeException("La etapa no es in-progress o paused.");
    }

    public void finish(ToDoItem toDoItem) {

    }

    public void agregarComentario(ToDoItem item, String comment) {
        item.getComentarios().add(comment);
    }

    public Duration workedTime(ToDoItem toDoItem) {
        return Duration.between(toDoItem.getStartTime(),LocalDateTime.now());
    }
}
