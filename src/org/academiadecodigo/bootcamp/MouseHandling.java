package org.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 12/06/17.
 */
public class MouseHandling implements MouseHandler,Clickable {


    public MouseHandling() {
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);


    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        click();

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    @Override
    public void click() {

    }
}
