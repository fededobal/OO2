package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TopografiaMixta implements Topografia {
    List<Topografia> topografias = new LinkedList<>();

    public TopografiaMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
        this.topografias = Arrays.asList(t1,t2,t3,t4);
    }

    public List<Topografia> getTopografias() {
        return this.topografias;
    }

    @Override
    public double proporcionAgua() {
        return this.topografias.stream()
                .mapToDouble(Topografia::proporcionAgua)
                .sum() / 4.0;
    }

    @Override
    public double proporcionTierra() {
        return this.topografias.stream()
                .mapToDouble(Topografia::proporcionTierra)
                .sum() / 4.0;
    }

    @Override
    public boolean igualA(Topografia otra) {
        return otra.igualAMixta(this);
    }

    @Override
    public boolean igualAAgua() {
        return false;
    }

    @Override
    public boolean igualATierra() {
        return false;
    }

    @Override
    public boolean igualAMixta(TopografiaMixta otraMixta) {
        return this.topografias.equals(otraMixta.getTopografias());
    }

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
