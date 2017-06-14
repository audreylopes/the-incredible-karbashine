package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public enum DirectionTypes {
    RIGHT,
    LEFT,
    UP,
    DOWN;

    public DirectionTypes fall() {

        switch (this) {
            case LEFT:
                return DOWN;
            case RIGHT:
                return DOWN;
            default:
                return null;
        }
    }


}
