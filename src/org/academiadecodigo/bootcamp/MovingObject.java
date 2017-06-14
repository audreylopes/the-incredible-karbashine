package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 14/06/2017.
 */
public class MovingObject extends GameObject implements Movable{

    public MovingObject(RepresentablePics picture) {
    }

    @Override
    public DirectionTypes getDirectionType() {
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
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public void click() {

    }

    @Override
    public void moveWhenPicked() {

    }
}
