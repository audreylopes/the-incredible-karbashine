package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Field.LevelField;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 14/06/2017.
 */
public class MovingObject extends GameObject implements Movable {

    private CollisionChecker collisionChecker;
    private boolean collision;
    private PlatformObject platformObject;
    private GameObject gameObject;


    public MovingObject(RepresentablePics picture) {
        super(picture);
    }

    @Override
    public DirectionTypes getDirectionType() {
        return null;
    }


    @Override
    public void moveRight(PlatformObject platformObject, int x, int y) {

        //int PosX = x;
        //int PosY = y;


        while (x < platformObject.getWidth()) {
            x++;
            setPosition(x, y);
        }
        if(platformObject.getX() + platformObject.getWidth() == x ){
            moveDown(x,y);
        }

    }

    @Override
    public void moveLeft(PlatformObject platformObject, int x, int y) {

        //int PosX = x;
        //int PosY = y;

        while (x > platformObject.getWidth()) {
            x--;
            setPosition(x, y);
        }
        if(platformObject.getX() == x ){
            moveDown(x,y);
        }
    }

    @Override
    public void moveDown(int x, int y) {

        //int PosX = x;
        //int PosY = y;

        while (y < LevelField.getHeight()) {  //MUST IMPLEMENT IN LEVELFIELD
            y++;
            setPosition(x, y);

        }
    }

    @Override
    public boolean getCollision(GameObject gameObject) {

        if (collisionChecker.checksCollision(gameObject)) {
            collision = true;
        }
        return false;

    }


    @Override
    public void moveWhenPicked() {

    }
}
