package org.example;

import java.util.List;

public interface BeaconDispatcher {

    void register(BeaconListener listener);

    void unregister(BeaconListener listener);

    void dispatch(BeaconEvent event);

    List<BeaconListener> getListeners();

}
