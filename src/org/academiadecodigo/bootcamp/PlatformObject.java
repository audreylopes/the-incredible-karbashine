package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 14/06/17.
 */
public class PlatformObject extends GameObject {

    private Position position;
    private int x;
    private int y;
    private int width;
    private Position leftLimit;
    private Position rightLimit;


    public PlatformObject(RepresentablePics picture) {
        super(picture);

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    @Override
    public Position getPosition() {
        return position;
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

    }

    @Override
    public void move(MouseEvent mouseEvent) {

    }

    @Override
    public void click() {

    }

    @Override
    public void moveWhenPicked() {

    }
}
