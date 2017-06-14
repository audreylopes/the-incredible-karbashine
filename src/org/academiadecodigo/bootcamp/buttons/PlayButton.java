package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class PlayButton implements Clickable {

    Clicker clicker;
    private int level;
    Picture picture;

    public PlayButton() {
   clicker = new Clicker(this);
   picture = new Picture(10,10,"http://t04.deviantart.net/FgQI1X8JOsAh4oFtS9vb6NqwVw0=/300x200/filters:fixed_height(100,100):origin()/pre05/8b9f/th/pre/f/2015/081/f/c/scratch_cat_by_tehlu9prod-d8ms8j7.png");

    }

    /**
     * @param@ Implementar codigo para o que o whenClick vai fazer;
     */
    @Override
    public void whenClick() {

    }



}

