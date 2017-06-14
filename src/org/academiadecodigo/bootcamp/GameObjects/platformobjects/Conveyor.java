package org.academiadecodigo.bootcamp.GameObjects.platformobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Conveyor extends PlatformObject {

    public Conveyor(RepresentablePics picture) {
        super(picture);
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
