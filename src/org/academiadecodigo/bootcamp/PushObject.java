package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/17.
 */
public class PushObject extends GameObject {


    private Direction direction;
    private CollisionChecker collisionChecker;
    private boolean collision;
    private PlatformObject platformObject;


    public PushObject(RepresentablePics picture) {
        super(picture);
       // platformObject = new PlatformObject();  //REPRESENTABLE PICTURE MISSING

    }



    private boolean getCollision(GameObject gameObject) {

        if (collisionChecker.checksCollision(gameObject)) {
            collision = true;
        }
        return false;
    }



    public void pushRight(MovingObject movingObject, int x, int y) {

        if (collision) {

            int initialPosX = x;
            int initialPosY = y;


            while (x < platformObject.getWidth()) {
                x++;
                movingObject.setPosition(x, y);
            }

            if(platformObject.getX() + platformObject.getWidth() == x ){
                movingObject.moveDown(x,y);
            }

        }
    }

    public void pushLeft(MovingObject movingObject, int x, int y) {


        if (collision) {

            int initialPosX = x;
            int initialPosY = y;


            while (x > platformObject.getWidth()) {
                x--;
                movingObject.setPosition(x, y);
            }

            if(platformObject.getX() == x ){
               movingObject.moveDown(x,y);
            }
        }
    }




    @Override
    public void moveWhenPicked() {

    }

    @Override
    public void show() {

    }
}
