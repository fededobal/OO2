package org.example;

public class Connection4G {
    private String symb;

    public Connection4G(String symb) {
        this.symb = symb;
    }

    public String transmit(String data, Integer crc) {
        return "4G transmitiendo: " + data + " con CRC: " + crc;
    }

    public String symb() {
        return this.symb;
    }
}
