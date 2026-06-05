package org.example;

public final class StreamBeacons {

    private BeaconDispatcher dispatcher = new DefaultDispatcher();


    public StreamBeacons() {
    }


    public void setDispatcher(BeaconDispatcher newDispatcher) {

        for (BeaconListener bl : this.dispatcher.getListeners()) {

            newDispatcher.register(bl);

        }

        this.dispatcher = newDispatcher;

    }


    public void registerListener(BeaconListener listener) {

        this.dispatcher.register(listener);

    }


    public void unregisterListener(BeaconListener listener) {

        this.dispatcher.unregister(listener);

    }


    public void emit(BeaconEvent event) {

        this.dispatcher.dispatch(event);

    }


    public void emit(String eventName) {

        BeaconEvent event = new DefaultEvent(eventName);

        dispatcher.dispatch(event);

    }

}



