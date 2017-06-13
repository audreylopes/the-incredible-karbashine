package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class BaseBall implements Movable, Jumpable, Representable, Pickable, FieldPosition {



    @Override
    public void jump(int heigth, int slope) {



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

    @Override
    public void hide() {

    }

    @Override
    public void move(MouseEvent mouseEvent) {

    }
}
