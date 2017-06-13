package org.academiadecodigo.bootcamp.gameobjects.jumpobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
<<<<<<< HEAD:src/org/academiadecodigo/bootcamp/gameobjects/CannonBall.java
public class CannonBall extends GameObject implements Movable, Jumpable, Representable, Pickable {


=======
public class CannonBall extends JumpObject implements Movable, Jumpable, Representable, Pickable {

>>>>>>> 09e8493e34c65bbe097be440c098361b9ec28ec3:src/org/academiadecodigo/bootcamp/gameobjects/jumpobjects/CannonBall.java
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
