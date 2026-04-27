package org.example;

import java.time.Duration;

public class Finished extends Estado {
    @Override
    public void agregarComentario(ToDoItem toDoItem, String comentario) {

    }

    @Override
    public Duration workedTime(ToDoItem toDoItem) {
        return Duration.between(toDoItem.getStartTime(),toDoItem.getEndTime());
    }
}
