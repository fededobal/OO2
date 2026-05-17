package org.example;

public class FeistelCipherAdapter implements CifradoInterfaz {
    private FeistelCipher servicio;

    public FeistelCipherAdapter(String key) {
        this.servicio = new FeistelCipher(key);
    }

    @Override
    public void cifrar(String mensaje) {
        servicio.encode(mensaje);
    }

    @Override
    public void descifrar(String mensaje) {
        servicio.encode(mensaje);
    }
}
