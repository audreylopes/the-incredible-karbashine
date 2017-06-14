package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Seesaw extends GameObject {

    Picker picker;
    public Seesaw(RepresentablePics picture) {
        super(picture);
        picker = new Picker(this);
    }


    @Override
    public void moveWhenPicked() {

    }
}
