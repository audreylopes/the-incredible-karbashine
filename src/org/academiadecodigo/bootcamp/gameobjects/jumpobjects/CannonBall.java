package org.academiadecodigo.bootcamp.gameobjects.jumpobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.jumptests.JumpObject;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */

public class CannonBall extends JumpObject implements Movable  {

<<<<<<< HEAD
public class CannonBall extends JumpObject implements Movable, Jumpable, Representable, Pickable {

=======
>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82
    public CannonBall(RepresentablePics picture) {
        super(picture);
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
}
