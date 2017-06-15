package org.academiadecodigo.bootcamp;
import org.academiadecodigo.bootcamp.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 12/06/17.
 */
public class Clicker implements MouseHandler{


    Clickable c;
    Position position;
    private int mouseX;
    private int mouseY;

    public Clicker(Clickable clickable) {
        c = clickable;
        position = new Position();
        Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);


    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        c.whenClick();
        mouseX = (int) mouseEvent.getX();
        mouseY = (int) mouseEvent.getY();

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public void setC(Clickable clickable) {
        c = clickable;
    }

    public int getMouseX() {
        return mouseX;
    }
    public int getMouseY() {
        return mouseY;
    }
}
