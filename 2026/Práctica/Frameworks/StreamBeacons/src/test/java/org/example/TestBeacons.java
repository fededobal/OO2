package org.example;
import org.junit.jupiter.api.Test;


public class TestBeacons {
    StreamBeacons streamBeacons = new StreamBeacons();

    @Test
    void Test() {
        streamBeacons.registerListener(new LoggingListener());
    }
}
