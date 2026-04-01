package org.example;

public class CharRing extends Ring {
    private char[] source;

    public CharRing(String src) {
        super();
        source = src.toCharArray();
    }

    @Override
    protected int length() {
        return source.length;
    }

    public char next() {
        return source[nextIndex()];
    }
}
