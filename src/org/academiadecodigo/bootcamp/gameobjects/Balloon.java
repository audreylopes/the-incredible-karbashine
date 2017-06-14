package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 13/06/2017.
 */
<<<<<<< HEAD
public class Balloon extends GameObject implements Representable, Movable {
=======
public class Balloon extends MovingObject implements Movable {
>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82

    private boolean collision;
    private DirectionTypes direction;
    Clicker clicker;

    public Balloon(RepresentablePics picture) {
        super(picture);
        clicker = new Clicker(this);

    }


<<<<<<< HEAD
=======
    private boolean collision;
    private DirectionTypes direction;
>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82

    public void checkCollision(){


    }


<<<<<<< HEAD

=======
>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82

    @Override
    public DirectionTypes getDirectionType() {
        return this.direction;
    }

    @Override
    public void moveRight() {
        direction.fall();
        if (getCollisionChecker().checksCollision(this)) {
            collision = true;
        }
    }

    @Override
    public void moveLeft() {
        direction.fall();
        if (getCollisionChecker().checksCollision(this)) {
            collision = true;
        }
    }

    @Override
    public void moveDown() {
        return;
    }

    public void moveUp(){
        direction = DirectionTypes.UP;

        if (getCollisionChecker().checksCollision(this)) {
            collision = true;
        }
    }

    @Override
    public boolean getCollision() {
        return collision;
    }


    @Override
    public void move(MouseEvent mouseEvent) {


    }

    @Override
    public void click() {

    }
<<<<<<< HEAD

    @Override
    public void whenClick() {


    }
=======
/*
   ____________ POR AGORA ESTÃO IMPLEMENTADOS NA CLASSE REPRESENTABLEPICS ___________
 */

>>>>>>> 05b80f357128b7666cde46d5dd9c4a131f5f2f82
}
