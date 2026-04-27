package org.example;

public class TopografiaTierra implements Topografia {

    @Override
    public double proporcionAgua() { return 0.0; }

    @Override
    public double proporcionTierra() { return 1.0; }

    // --- Lógica de Igualdad ---
    @Override
    public boolean igualA(Topografia otra) {
        return otra.igualATierra();
    }

    @Override
    public boolean igualAAgua() { return false; }

    @Override
    public boolean igualATierra() { return true; }

    @Override
    public boolean igualAMixta(TopografiaMixta mixta) { return false; }

    @Override
    public boolean igualAPantano() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Topografia)) return false;
        return this.igualA((Topografia) obj);
    }
}
