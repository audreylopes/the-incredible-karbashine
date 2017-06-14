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


<<<<<<< HEAD
    private boolean getCollision(GameObject gameObject) {

        if (collisionChecker.checksCollision(gameObject)) {
            collision = true;
        }
=======
    private boolean getCollision(){
<<<<<<< HEAD

return false;
>>>>>>> 294bcbb061614a0e5859e1ded69ac2bee46c3d13
=======
        return false;
>>>>>>> 1cabc321b9a6389f5bab7aba4181acfaaf0f09ec

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

<<<<<<< HEAD



    @Override
    public void move(MouseEvent mouseEvent) {

    }

=======
>>>>>>> 1cabc321b9a6389f5bab7aba4181acfaaf0f09ec
    @Override
    public void moveWhenPicked() {

    }

    @Override
    public void show() {

    }
}
