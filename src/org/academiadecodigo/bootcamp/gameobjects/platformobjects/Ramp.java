package org.academiadecodigo.bootcamp.gameobjects.platformobjects;

import org.academiadecodigo.bootcamp.*;

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
