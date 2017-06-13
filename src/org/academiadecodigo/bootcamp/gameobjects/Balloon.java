package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Balloon extends GameObject implements Representable, Movable, Pickable {


    private boolean collision;

    public void checkCollision(){


    }

    public Balloon(RepresentablePics picture) {
        super(picture);
    }

    private DirectionTypes direction;

    @Override
    public DirectionTypes getDirectionType() {
        return this.direction;
    }

    @Override
    public void moveRight() {
        direction.rotateToRight();
    }

    @Override
    public void moveLeft() {
        direction.rotateToLeft();
    }

    @Override
    public void moveDown() {
        return;
    }

    public void moveUp(){
        direction = DirectionTypes.UP;
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
    public void move(MouseEvent mouseEvent) {

    }
}
