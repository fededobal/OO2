package org.example;

import java.time.LocalDateTime;

public class DefaultEvent implements BeaconEvent {

    private String name;

    private LocalDateTime timestamp = LocalDateTime.now();

    public DefaultEvent(String eventName) {
        this.name = eventName;
    }


    public String getName() {

        return this.name;

    }


    public LocalDateTime getTimestamp() {

        return this.timestamp;

    }

}
