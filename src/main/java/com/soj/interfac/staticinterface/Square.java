package com.soj.interfac.staticinterface;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square implements Drawable {
    static final Logger logger = LogManager.getLogger(Square.class.getName());

    @Override
    public void draw(String str) {
        logger.debug(str);

    }
}
