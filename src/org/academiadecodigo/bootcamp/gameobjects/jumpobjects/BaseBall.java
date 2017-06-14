package org.academiadecodigo.bootcamp.gameobjects.jumpobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.jumptests.JumpObject;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
<<<<<<< HEAD
public class BaseBall extends JumpObject implements Movable, Jumpable, Representable, Pickable, FieldPosition {
=======
public class BaseBall extends JumpObject implements Movable {
>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82


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
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public void jumpLeft(int heigth, int slope) {

    }

    @Override
    public void click() {

    }
}
