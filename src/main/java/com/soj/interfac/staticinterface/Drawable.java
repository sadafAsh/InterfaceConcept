package com.soj.interfac.staticinterface;

public interface Drawable {
    static int cube(int x) {
        return x * x * x;

    }

    public void draw(String str);
}
