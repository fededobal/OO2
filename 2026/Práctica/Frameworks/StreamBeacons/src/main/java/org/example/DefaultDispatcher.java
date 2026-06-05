package org.example;

import java.util.ArrayList;
import java.util.List;

public class DefaultDispatcher implements BeaconDispatcher {

    private List<BeaconListener> listeners = new ArrayList<>();

    @Override

    public void register(BeaconListener listener) {

        this.listeners.add(listener);

    }


    @Override

    public void unregister(BeaconListener listener) {

        this.listeners.remove(listener);

    }

    @Override

    public void dispatch(BeaconEvent event) {

        for (BeaconListener bl : this.listeners) {

            try {

                bl.onEvent(event);

            } catch (Exception e) { /* Ignore exception */ }

        }

    }


    @Override

    public List<BeaconListener> getListeners() {

        return this.listeners;

    }

}
