package org.academiadecodigo.bootcamp.GameObjects.platformobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Ramp extends PlatformObject {

    Picker picker;

    public Ramp(RepresentablePics picture) {
        super(picture);
        picker = new Picker(this);
    }


    @Override
    public void moveWhenPicked() {

    }
}
