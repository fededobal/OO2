package org.example;

import java.util.Random;

public class TarjetaMagnetica implements Credencial {
    @Override
    public boolean permitirIngreso() {
        return new Random().nextBoolean();
    }
}
