package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class BowlingBall extends GameObject implements Movable, Jumpable, Representable, Pickable {


    public BowlingBall(RepresentablePics picture) {
        super(picture);
    }

    @Override
    public void jump(int heigth, int slope) {

    }

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
