package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Balloon extends GameObject implements Representable, Movable, Pickable {


<<<<<<< HEAD
    public Balloon(RepresentablePics picture) {
        super(picture);
    }
=======
>>>>>>> 09e8493e34c65bbe097be440c098361b9ec28ec3
    private boolean collision;
    private DirectionTypes direction;

    public void checkCollision(){


    }


<<<<<<< HEAD

=======
>>>>>>> 09e8493e34c65bbe097be440c098361b9ec28ec3

    @Override
    public DirectionTypes getDirectionType() {
        return this.direction;
    }

    @Override
    public void moveRight() {
        direction.rotateToRight();
        if (getCollisionChecker().checksCollision(this)) {
            collision = true;
        }
    }

    @Override
    public void moveLeft() {
        direction.rotateToLeft();
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
/*
   ____________ POR AGORA ESTÃO IMPLEMENTADOS NA CLASSE REPRESENTABLEPICS ___________
 */
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
