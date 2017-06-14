package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 14/06/2017.
 */
public class Picker implements MouseHandler{

    Pickable p;

    public Picker(Pickable pickable) {
        p = pickable;
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_MOVED);
    }




    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        p.moveWhenPicked();

    }
}
