package org.example;

import java.util.Random;

public class PulseraSumergible implements Credencial {
    @Override
    public boolean permitirIngreso() {
        return new Random().nextBoolean();
    }
}
