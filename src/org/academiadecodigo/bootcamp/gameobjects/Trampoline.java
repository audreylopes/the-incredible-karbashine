package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Trampoline extends GameObject {

    Picker picker;
    public Trampoline(RepresentablePics picture) {
        super(picture);
        picker = new Picker(this);
    }

    @Override
    public void moveWhenPicked() {

    }
}
