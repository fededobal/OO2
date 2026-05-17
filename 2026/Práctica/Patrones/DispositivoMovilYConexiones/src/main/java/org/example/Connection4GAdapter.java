package org.example;

public class Connection4GAdapter implements Connection {
    private Connection4G connection4G;

    public Connection4GAdapter(String symb) {
        this.connection4G = new Connection4G(symb);
    }

    public String sendData(String data, Integer crc) {
        return connection4G.transmit(data,crc);
    }

    public String pict() {
        return connection4G.symb();
    }
}
