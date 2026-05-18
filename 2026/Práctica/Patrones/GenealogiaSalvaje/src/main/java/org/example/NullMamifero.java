package org.example;

import java.util.Date;

public class NullMamifero extends Mamifero {
    public NullMamifero() {
        super();
    }

    @Override
    public Mamifero getPadre() {
        return this;
    }

    @Override
    public Mamifero getMadre() {
        return this;
    }

    @Override
    public Boolean tieneComoAncestroA(Mamifero unMamifero) {
        return false;
    }
}
