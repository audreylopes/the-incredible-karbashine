package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Field.FieldPosition;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Position implements FieldPosition {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int newX) {
        this.x = newX;
    }

    protected void setY(int newY) {
        this.y = newY;
    }



    @Override
    public void hide() {

    }

}


