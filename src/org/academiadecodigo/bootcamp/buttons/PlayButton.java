package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.MouseHandling;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class PlayButton implements Clickable {

    private int level;
    private Picture picture;
    private Rectangle rectangle;

    public PlayButton() {
        this.picture = new Picture(50,50,"http://orig05.deviantart.net/47e3/f/2013/126/d/b/my_app___car_sprite_by_nicolaspok-d64czz9.png");
        this.rectangle = new Rectangle(10,10,2000,1000);


        rectangle.draw();
    }

    @Override
    public void click() {

    }
}
