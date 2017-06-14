package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.MouseHandling;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class PlayButton implements Clickable,MouseHandler {

    Mouse mouse;
    private int level;

    public PlayButton() {
        mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);



    }

    /**
     * @param@ Implementar codigo para o que o click vai fazer;
     */
    @Override
    public void click() {
    }


    //Depois o click vai ser chamada no mouseClicked e vai executar o codigo dentro do clicl();
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        click();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}

