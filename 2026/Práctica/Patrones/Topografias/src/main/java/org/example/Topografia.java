package org.example;

public interface Topografia {
    double proporcionAgua();
    double proporcionTierra();

    boolean igualA(Topografia otra);
    boolean igualAAgua();
    boolean igualATierra();
    boolean igualAMixta(TopografiaMixta mixta);
    boolean igualAPantano();
}