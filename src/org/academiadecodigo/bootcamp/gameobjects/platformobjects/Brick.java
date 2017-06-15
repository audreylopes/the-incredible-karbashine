package org.academiadecodigo.bootcamp.gameobjects.platformobjects;

import org.academiadecodigo.bootcamp.*;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Brick extends PlatformObject {


    Picker picker;

    public Brick(RepresentablePics picture) {
        super(picture);
        picker = new Picker(this);
    }





    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void show() {

    }


    @Override
    public void moveWhenPicked() {

    }
}
