package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public interface Movable {

    DirectionTypes getDirectionType();

    void moveRight(PlatformObject platformObject, int x, int y);
    void moveLeft(PlatformObject platformObject, int x, int y);
    void moveDown(int x, int y);

    boolean getCollision(GameObject gameObject);


}
