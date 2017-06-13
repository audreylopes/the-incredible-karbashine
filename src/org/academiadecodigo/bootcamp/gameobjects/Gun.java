package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.GameObject;
import org.academiadecodigo.bootcamp.Pickable;
import org.academiadecodigo.bootcamp.Representable;
import org.academiadecodigo.bootcamp.RepresentablePics;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Gun extends GameObject implements Representable, Pickable {
    public Gun(RepresentablePics picture) {
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
