package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DoNotDisturbDispatcher implements BeaconDispatcher {

    private List<BeaconListener> listeners = new ArrayList<>();

    private Queue<BeaconEvent> queue = new LinkedList<>();

    private boolean paused = false;


    @Override

    public void register(BeaconListener listener) {

        listeners.add(listener);

    }


    @Override

    public void unregister(BeaconListener listener) {

        this.listeners.remove(listener);

    }


    @Override

    public void dispatch(BeaconEvent event) {

        if (paused) {

            queue.add(event);

        } else {

            notifyListeners(event);

        }

    }


    @Override

    public List<BeaconListener> getListeners() {

        return this.listeners;

    }


    public void pause() {

        paused = true;

    }


    public void resume() {

        paused = false;

        while (!queue.isEmpty()) {

            notifyListeners(queue.poll());

        }

    }


    private void notifyListeners(BeaconEvent event) {

        for (BeaconListener bl : listeners) {

            try {

                bl.onEvent(event);

            } catch (Exception e) { /* Ignore exception */ }

        }

    }

}
