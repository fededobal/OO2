package org.example;

public class RC4Adapter implements CifradoInterfaz {
    private RC4 servicio;
    private String key;

    public RC4Adapter(String key) {
        this.servicio = new RC4();
        this.key = key;
    }

    @Override
    public void cifrar(String mensaje) {
        servicio.encriptar(mensaje,key);
    }

    @Override
    public void descifrar(String mensaje) {
        servicio.desencriptar(mensaje,key);
    }
}
