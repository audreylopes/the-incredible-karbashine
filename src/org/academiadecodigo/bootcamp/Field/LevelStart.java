package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;
import org.academiadecodigo.bootcamp.GameObjectFactory;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

/**
 * Created by codecadet on 15/06/17.
 */
public class LevelStart extends Level implements Clickable{

    private boolean isCompleted;
    private Picture p;
    private Field field;
    private FieldPosition position;
    private GameObjectFactory gameObjectFactory;
    Clicker clicker;
    private Rectangle startButton;
    LevelFactory levelFactory;



    public LevelStart(boolean b) {
        this.isCompleted = b;
        p = new Picture(10,10,"");
        clicker = new Clicker(this);
        startButton = new Rectangle(10,10,50,50); // Fazer bem a posiçao e o tamanho do rectangulo;
        levelFactory = new LevelFactory();
    }


    @Override
    public void whenClick() {
        if(clicker.getMouseX() >= startButton.getX() &&
                clicker.getMouseX() <= (startButton.getWidth() + startButton.getX()) &&
                clicker.getMouseY() >= startButton.getY() &&
                clicker.getMouseY() <= (startButton.getHeight() + startButton.getY())) {
            isCompleted();
            levelFactory.nextLevel();
        }
    }
}
