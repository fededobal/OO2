package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends Estado {
    @Override
    public void start(ToDoItem toDoItem) {
        toDoItem.setStartTime(LocalDateTime.now());
        toDoItem.setState(new InProgress());
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("El ToDoItem no se inició");
    }
}
