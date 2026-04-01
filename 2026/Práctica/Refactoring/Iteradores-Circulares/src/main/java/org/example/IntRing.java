package org.example;

public class IntRing extends Ring {
    private int[] source;

    public IntRing(int[] src) {
        super();
        source = src;
    }

    @Override
    protected int length() {
        return source.length;
    }

    public int next() {
        return source[nextIndex()];
    }
}
