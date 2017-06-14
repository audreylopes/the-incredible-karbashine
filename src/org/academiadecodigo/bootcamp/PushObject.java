package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/17.
 */
public class PushObject extends GameObject  {


    private Direction direction;


    public PushObject(RepresentablePics picture) {
        super(picture);
    }


    private boolean getCollision(){
        return false;

    }


    public void pushRight(){

    }

    public void pushLeft(){

    }

    @Override
    public void moveWhenPicked() {

    }

    @Override
    public void show() {

    }
}
