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
        collisionChecker = new CollisionChecker(); // ARRAY MISSING
        platformObject = new PlatformObject();  //REPRESENTABLE PICTURE MISSING

    }


    private boolean getCollision(GameObject gameObject) {

        if (collisionChecker.checksCollision(gameObject)) {
            collision = true;
        }
    }


    public void pushRight(GameObject gameObject, int x, int y) {

        if (collision) {

            int initialPosX = x;
            int initialPosY = y;
            int distance;

            int pushDistance = distance > platformObject.getWidth() ? platformObject.getWidth() : distance;
            int finalPosX = x + pushDistance;
            int finalPosY = y;


        }
    }

    public void pushLeft(GameObject gameObject, int x, int y) {


        if (collision) {

            int initialPosX = x;
            int initialPosY = y;
            int distance;

            int pushDistance = distance < platformObject.getWidth() ? platformObject.getWidth() : distance;
            int finalPosX = x - pushDistance;
            int finalPosY = y;
        }
    }



    @Override
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public void moveWhenPicked() {

    }

    @Override
    public void show() {

    }
}
