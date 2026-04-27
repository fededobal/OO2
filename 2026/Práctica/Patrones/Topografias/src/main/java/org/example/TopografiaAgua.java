package org.example;

public class TopografiaAgua implements Topografia {

    @Override
    public double proporcionAgua() { return 1.0; }

    @Override
    public double proporcionTierra() { return 0.0; }

    @Override
    public boolean igualA(Topografia otra) {
        return otra.igualAAgua();
    }

    @Override
    public boolean igualAAgua() { return true; }

    @Override
    public boolean igualATierra() { return false; }

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
