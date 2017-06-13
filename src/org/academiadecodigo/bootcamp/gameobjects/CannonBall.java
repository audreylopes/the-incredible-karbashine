package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class CannonBall extends GameObject implements Movable, Jumpable, Representable, Pickable {
<<<<<<< HEAD
=======


>>>>>>> f0da2230ee2214d135974d76b8f7949c22588cde
    public CannonBall(RepresentablePics picture) {
        super(picture);
    }

    @Override
    public void jump(int heigth, int slope) {

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

    @Override
    public void move(MouseEvent mouseEvent) {

    }
}
