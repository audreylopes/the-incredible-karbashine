package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.*;
import org.academiadecodigo.bootcamp.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
<<<<<<< HEAD
public class BaseBall implements Movable, Jumpable, Representable, Pickable, FieldPosition {
=======
public class BaseBall extends GameObject implements Movable, Jumpable, Representable, Pickable, FieldPosition {
>>>>>>> f0da2230ee2214d135974d76b8f7949c22588cde

    private boolean collision;
    private DirectionTypes direction;

    public BaseBall(RepresentablePics picture) {
        super(picture);
    }

    public void checkCollision(){


    }

    @Override
    public void jump(int heigth, int slope) {

        int currentY;
        for (int i = getX(); collision ; i++) {

            currentY = i / slope - heigth;            //FÓRMULA DA PARABOLA
            setY(currentY);

            checkCollision();                       //VAI CHECKANDO SEMPRE SE CHOCA COM ALGUM OBJECTO
        }

    }

    private void setY(int newY){

    }


    @Override
    public DirectionTypes getDirectionType() {
        return this.direction;
    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public boolean getCollision() {
        return collision;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void show() {


    }

    @Override
    public void hide() {

    }

    @Override
    public void move(MouseEvent mouseEvent) {

    }
}
