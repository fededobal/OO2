package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCharRing {
    private CharRing ring;

    @BeforeEach
    void SetUp() {
        ring = new CharRing("Federico");
    }

    @Test
    void TestCaracter() {
        for(char c : "Federico".toCharArray())
            Assertions.assertEquals(c,ring.next());
    }
}
