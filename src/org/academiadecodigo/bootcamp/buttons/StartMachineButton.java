package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 13/06/2017.
 */
public class StartMachineButton implements Clickable{

    Clicker clicker;

    public StartMachineButton() {
        clicker = new Clicker(this);
    }




    @Override
    public void whenClick() {

    }

}
