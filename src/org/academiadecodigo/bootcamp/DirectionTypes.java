package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public enum DirectionTypes {
    RIGHT,
    LEFT,
    UP,
    DOWN;

    public DirectionTypes rotateToLeft() {

        switch (this) {
            case UP:
                return LEFT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            case DOWN:
                return RIGHT;
            default:
                return null;
        }
    }

    public DirectionTypes rotateToRight() {

        switch (this) {
            case UP:
                return RIGHT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            case DOWN:
                return LEFT;
            default:
                return null;
        }
    }
}
