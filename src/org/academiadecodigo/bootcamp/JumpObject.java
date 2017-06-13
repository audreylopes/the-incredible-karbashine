package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 13/06/2017.
 */
public class JumpObject extends GameObject implements Jumpable, Representable{



    public JumpObject(RepresentablePics picture) {
        super(picture);
    }

    public void checkCollision(){


    }


    @Override
    public void jumpRight(int heigth, int slope) {

        int currentY;
        for (int i = getX(); collision ; i++) {

            currentY = i / slope - heigth;            //FÓRMULA DA PARABOLA
            setY(currentY);

            checkCollision();                       //VAI CHECKANDO SEMPRE SE CHOCA COM ALGUM OBJECTO
        }

    }

    @Override
    public void jumpLeft(int heigth, int slope) {

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
}
