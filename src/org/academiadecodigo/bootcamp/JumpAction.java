package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 13/06/2017.
 */
public class JumpAction extends GameObject implements Jumpable{



    public JumpAction(RepresentablePics picture) {
        super(picture);
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

}
