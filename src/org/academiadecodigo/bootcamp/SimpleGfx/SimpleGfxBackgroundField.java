package org.academiadecodigo.bootcamp.SimpleGfx;

import org.academiadecodigo.bootcamp.Field.LevelField;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/17.
 */
public class SimpleGfxBackgroundField{

    Rectangle rectangle;
    private int x;
    private int y;
    LevelField levelField;



    public SimpleGfxBackgroundField(){
        super();
    }


    @Override
    public void init() {
        rectangle = new Rectangle(10,10,1000,800);
        rectangle.draw();
        Picture background;


    }
}
