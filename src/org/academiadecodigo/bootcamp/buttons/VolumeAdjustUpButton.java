package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import sun.tools.tree.ThisExpression;

/**
 * Created by codecadet on 13/06/2017.
 */
public class VolumeAdjustUpButton implements Clickable,MouseHandler{


    Mouse mouse;

    public VolumeAdjustUpButton() {
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
