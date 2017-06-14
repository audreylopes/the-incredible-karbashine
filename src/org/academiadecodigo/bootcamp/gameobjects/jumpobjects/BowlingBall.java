package org.academiadecodigo.bootcamp.gameobjects.jumpobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.jumptests.JumpObject;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class BowlingBall extends JumpObject implements Movable  {


    public BowlingBall(RepresentablePics picture) {
        super(picture);
    }


    @Override
    public void move(MouseEvent mouseEvent) {

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
    public void click() {

    }
}
