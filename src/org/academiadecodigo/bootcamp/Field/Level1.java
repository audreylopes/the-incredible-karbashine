package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 15/06/17.
 */
public class Level1 extends Level{

    private boolean isCompleted;
    private Picture p;

    public Level1(boolean b) {
        this.isCompleted = b;
        p = new Picture(10,10,"");

    }

}
