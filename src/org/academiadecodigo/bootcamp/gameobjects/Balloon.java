package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.Direction;
import org.academiadecodigo.bootcamp.Movable;
import org.academiadecodigo.bootcamp.Pickable;
import org.academiadecodigo.bootcamp.Representable;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Balloon implements Representable, Movable, Pickable {
    @Override
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public Direction getDirection() {
        return null;
    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public boolean getCollision() {
        return false;
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
