package org.academiadecodigo.bootcamp.gameobjects.jumpobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class BaseBall extends JumpObject implements Movable, Jumpable, Representable, Pickable, FieldPosition {


    private boolean collision;
    private DirectionTypes direction;

    public BaseBall(RepresentablePics picture) {
        super(picture);
    }



    private void setY(int newY){

    }


    @Override
    public DirectionTypes getDirectionType() {
        return this.direction;
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
        return collision;
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

    @Override
    public void jumpLeft(int heigth, int slope) {

    }
}