package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIntRing {
    private IntRing ring;

    @BeforeEach
    void SetUp() {
        ring = new IntRing(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    void TestCaracter() {
        for(int i : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
            Assertions.assertEquals(i,ring.next());
    }
}
