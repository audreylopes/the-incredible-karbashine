package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Balloon extends GameObject implements Representable, Movable, Pickable,MouseHandler {


    public Balloon(RepresentablePics picture) {
        super(picture);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
    }
    private boolean collision;
    private DirectionTypes direction;
    Mouse mouse;



    public void checkCollision(){


    }




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

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        move(mouseEvent);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
