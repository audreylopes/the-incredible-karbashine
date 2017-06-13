package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
<<<<<<< HEAD
public class WindBlower extends GameObject implements Representable, Pickable {
=======
public class WindBlower extends PushObject implements Representable, Pickable {
>>>>>>> 09e8493e34c65bbe097be440c098361b9ec28ec3

    public WindBlower(RepresentablePics picture) {
        super(picture);
    }

    @Override
    public void move(MouseEvent mouseEvent) {

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
