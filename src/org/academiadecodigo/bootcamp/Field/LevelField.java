package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.bootcamp.Representable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

/**
 * Created by codecadet on 13/06/17.
 */
public class LevelField implements Representable, FieldPosition, Field{


    private int x;
    private int y;
    private Position position;
    Picture p;
    LinkedList levels;
    LevelFactory levelFactory;

    public LevelField() {
        this.levelFactory = new LevelFactory();
    }

    @Override
    public FieldPosition getPosition() {
        return (FieldPosition) p;
    }


    @Override
    public void init() {
        levelFactory.nextLevel();

    }

    @Override
    public void setPosition() {

    }


    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void show() {
        p.draw();
    }

    @Override
    public void hide() {
        this.p.delete();
    }


}
