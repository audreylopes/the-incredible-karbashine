package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 13/06/2017.
 */
public class QuitButton implements Clickable,MouseHandler{

    Mouse mouse;

    public QuitButton() {
        mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
    }

    @Override
    public void click() {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        click();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
