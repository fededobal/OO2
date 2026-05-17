package org.example;

public class WifiConn implements  Connection {
    private String pict;

    public WifiConn(String pict) {
        this.pict = pict;
    }

    @Override
    public String sendData(String data, Integer crc) {
        return "WiFi transmitiendo: " + data + " con CRC: " + crc;
    }

    @Override
    public String pict() {
        return this.pict;
    }
}
