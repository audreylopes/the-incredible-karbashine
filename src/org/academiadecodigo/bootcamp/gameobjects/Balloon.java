package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */

    public class Balloon extends MovingObject implements Movable {

        private boolean collision;
        private DirectionTypes direction;
        Picker picker;
        Picture picture;

        public Balloon(RepresentablePics picture) {
            super(picture);
            picker = new Picker(this);

        }


        @Override
        public void moveWhenPicked() {
        }

        public void checkCollision() {

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

        public void moveUp() {
            direction = DirectionTypes.UP;

            if (getCollisionChecker().checksCollision(this)) {
                collision = true;
            }
        }

        @Override
        public boolean getCollision() {
            return collision;
        }





/*
   ____________ POR AGORA ESTÃO IMPLEMENTADOS NA CLASSE REPRESENTABLEPICS ___________
 */

}
