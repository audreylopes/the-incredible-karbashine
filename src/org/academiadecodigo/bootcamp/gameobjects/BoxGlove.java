package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class BoxGlove extends PushObject implements Representable, Pickable{


    public BoxGlove(RepresentablePics picture) {
        super(picture);
    }

    @Override
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void show() {

    }
}
