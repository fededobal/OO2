package org.example;

public class Mensajero {
    private CifradoInterfaz cifradoInterfaz;

    public Mensajero(CifradoInterfaz cifradoInterfaz) {
        this.cifradoInterfaz = cifradoInterfaz;
    }

    public void cambiarCifradoInterfaz(CifradoInterfaz cifradoInterfaz) {
        this.cifradoInterfaz = cifradoInterfaz;
    }

    public void enviar(String mensaje) {
        cifradoInterfaz.cifrar(mensaje);

    }

    public void recibir(String mensaje) {
        cifradoInterfaz.descifrar(mensaje);
    }
}
