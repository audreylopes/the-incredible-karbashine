package org.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 12/06/17.
 */
public class Clicker implements MouseHandler{


    Clickable c;

    public Clicker(Clickable clickable) {
        c = clickable;
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        c.whenClick();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public void setC(Clickable clickable) {
        c = clickable;
    }
}
