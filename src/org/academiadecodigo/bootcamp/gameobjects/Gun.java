package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class Gun extends PushObject implements Representable, Pickable{


    Picker picker;
    public Gun(RepresentablePics picture) {
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
}
