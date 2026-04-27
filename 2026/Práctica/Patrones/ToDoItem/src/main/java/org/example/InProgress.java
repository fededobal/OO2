package org.example;

import java.time.LocalDateTime;

public class InProgress extends Estado {
    @Override
    public void togglePause(ToDoItem toDoItem) {
        toDoItem.setState(new Paused());
    }

    @Override
    public void finish(ToDoItem toDoItem) {
        toDoItem.setEndTime(LocalDateTime.now());
        toDoItem.setState(new Finished());
    }
}
