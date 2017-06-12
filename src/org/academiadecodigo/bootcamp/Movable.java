package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public interface Movable {

    Direction getDirection();

    void moveRight();
    void moveLeft();
    void moveDown();

    boolean getCollision();


}
