package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public interface Movable {

    DirectionTypes getDirectionType();

    void moveRight();
    void moveLeft();
    void moveDown();

    boolean getCollision();


}
