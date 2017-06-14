package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Balloon extends MovingObject implements Movable {


    public Balloon(RepresentablePics picture) {
        super(picture);
    }


    private boolean collision;
    private DirectionTypes direction;

    public void checkCollision(){


    }



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
/*
   ____________ POR AGORA ESTÃO IMPLEMENTADOS NA CLASSE REPRESENTABLEPICS ___________
 */

}
