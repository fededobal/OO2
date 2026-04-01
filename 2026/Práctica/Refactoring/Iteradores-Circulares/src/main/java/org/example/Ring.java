package org.example;

public abstract class Ring {
    protected int idx;

    public Ring() {
        idx = 0;
    }

    protected abstract int length();

    protected int nextIndex() {
        if (idx >= length())
            idx = 0;
        return idx++;
    }
}
