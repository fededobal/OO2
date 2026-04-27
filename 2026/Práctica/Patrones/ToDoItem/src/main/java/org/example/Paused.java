package org.example;

import java.time.LocalDateTime;

public class Paused extends Estado {
    @Override
    public void togglePause(ToDoItem toDoItem) {
        toDoItem.setState(new InProgress());
    }

    @Override
    public void finish(ToDoItem toDoItem) {
        toDoItem.setEndTime(LocalDateTime.now());
        toDoItem.setState(new Finished());
    }
}
