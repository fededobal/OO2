package org.example;

public class LoggingListener implements BeaconListener {
    @Override
    public void onEvent(BeaconEvent event) {
        System.out.println("Evento: " + event.getName() + "; Fecha y hora: " + event.getTimestamp());
    }
}