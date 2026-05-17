package org.example;

public class Dispositivo {
    private Connection connection;
    private Ringer ringer;
    private CRC_Calculator crcCalculator;
    private Display display;

    public Dispositivo(Connection connection, CRC_Calculator crcCalculator) {
        this.connection = connection;
        this.crcCalculator = crcCalculator;
        this.ringer = new Ringer();
        this.display = new Display();
    }

    public String send(String data) {
        Integer crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

    public void conectarCon(Connection connection) {
        this.connection = connection;
        display.showBanner(connection.pict());
        ringer.ring();
    }

    public void configurarCRC(CRC_Calculator crcCalculator) {
        this.crcCalculator = crcCalculator;
    }
}
