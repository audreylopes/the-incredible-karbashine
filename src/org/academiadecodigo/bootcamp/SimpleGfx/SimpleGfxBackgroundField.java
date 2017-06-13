package org.academiadecodigo.bootcamp.SimpleGfx;

import org.academiadecodigo.bootcamp.Field.AbstractBackgroundField;
import org.academiadecodigo.bootcamp.Field.LevelField;
import org.academiadecodigo.bootcamp.Field.ScoreField;
import org.academiadecodigo.bootcamp.Field.SideMenuField;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

/**
 * Created by codecadet on 13/06/17.
 */
public class SimpleGfxBackgroundField extends AbstractBackgroundField{

    Rectangle rectangle;
    private int x;
    private int y;
    LevelField levelField;
    ScoreField scoreField;
    SideMenuField sideMenuField;


    public SimpleGfxBackgroundField(){
        super();
    }


    @Override
    public void init() {
        rectangle = new Rectangle(10,10,1000,800);
        rectangle.draw();
        Picture background


    }
}
