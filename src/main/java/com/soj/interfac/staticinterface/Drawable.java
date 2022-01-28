package com.soj.interfac.staticinterface;

public interface Drawable {
    public String draw();
    static int cube(int x){
        return x*x*x;
    }
}
