package org.academiadecodigo.bootcamp.jumptests;

import org.academiadecodigo.bootcamp.RepresentablePics;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 14/06/2017.
 */
public class TesterJump {
    public static void main(String[] args) {

        RepresentablePics pic = new RepresentablePics("http://answers.unity3d.com/storage/temp/66598-ball.png");
        JumpObject ball = new JumpObject(pic);
        Rectangle rectangle = new Rectangle(10,10, 500, 500);

        rectangle.draw();
        pic.show();
        ball.jumpRight(30,4);







    }


}
