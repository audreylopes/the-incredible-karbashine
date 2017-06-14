package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 13/06/2017.
 */

    public class Balloon extends MovingObject implements Movable {

        private boolean collision;
        private DirectionTypes direction;
        Clicker clicker;

        public Balloon(RepresentablePics picture) {
            super(picture);
            clicker = new Clicker(this);

        }



        public void checkCollision() {






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


        @Override
        public void move(MouseEvent mouseEvent) {


        }

        @Override
        public void click() {

        }

        @Override
        public void whenClick() {


        }
/*
   ____________ POR AGORA ESTÃO IMPLEMENTADOS NA CLASSE REPRESENTABLEPICS ___________
 */

    }
}
