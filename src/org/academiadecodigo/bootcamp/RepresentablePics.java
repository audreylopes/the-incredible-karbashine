package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class RepresentablePics implements Representable{

    private Picture p;

    public RepresentablePics(String str) {
        this.p = new Picture(0, 0, str);
    }

    @Override
    public int getX() {
        return p.getX();
    }

    @Override
    public int getY() {
        return p.getY();
    }

    @Override
    public void show() {
        p.draw();
    }


}
