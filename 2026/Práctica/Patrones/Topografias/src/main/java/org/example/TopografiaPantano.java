package org.example;

public class TopografiaPantano implements Topografia {

    @Override
    public double proporcionAgua() { return 0.7; }

    @Override
    public double proporcionTierra() { return 0.3; }

    @Override
    public boolean igualA(Topografia otra) {
        return otra.igualAPantano();
    }

    @Override
    public boolean igualAAgua() { return false; }

    @Override
    public boolean igualATierra() { return false; }

    @Override
    public boolean igualAMixta(TopografiaMixta mixta) { return false; }

    @Override
    public boolean igualAPantano() { return true; }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Topografia)) return false;
        return this.igualA((Topografia) obj);
    }
}