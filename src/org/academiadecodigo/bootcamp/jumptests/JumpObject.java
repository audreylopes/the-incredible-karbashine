package org.academiadecodigo.bootcamp.jumptests;

import org.academiadecodigo.bootcamp.GameObject;
import org.academiadecodigo.bootcamp.Jumpable;
import org.academiadecodigo.bootcamp.RepresentablePics;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

/**
 * Created by codecadet on 13/06/2017.
 */
public class JumpObject extends GameObject implements Jumpable {


    private boolean collision;

    public JumpObject(RepresentablePics picture) {
        //super(picture);
    }

    public void checkCollision(){



    }


    @Override
    public void jumpRight(int heigth, int slope) {

        int currentY;
        for (int i = getX(); collision ; i++) {

            currentY = (int)Math.pow((i / slope) - heigth, 2);            //FÓRMULA DA PARABOLA
            //setY(currentY);
            //setX = i;

            super.setPosition(i,currentY);


            checkCollision();                       //VAI CHECKANDO SEMPRE SE CHOCA COM ALGUM OBJECTO
        }

    }

    @Override
    public void jumpLeft(int heigth, int slope) {

        int currentY;
        for (int i = getX(); collision ; i--) {

            currentY = (int)Math.pow((i / slope) - heigth, 2);            //FÓRMULA DA PARABOLA

            super.setPosition(i,currentY);

            checkCollision();                       //VAI CHECKANDO SEMPRE SE CHOCA COM ALGUM OBJECTO
        }

    }





    @Override
    public void moveWhenPicked() {

    }
}
