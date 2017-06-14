package org.academiadecodigo.bootcamp.jumptests;

import org.academiadecodigo.bootcamp.GameObjectFactory;
import org.academiadecodigo.bootcamp.GameObjectTypes;
import org.academiadecodigo.bootcamp.RepresentablePics;
import org.academiadecodigo.bootcamp.gameobjects.Balloon;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 14/06/2017.
 */
public class TesterJump {
    public static void main(String[] args) {

        /*
        RepresentablePics pic = new RepresentablePics("http://answers.unity3d.com/storage/temp/66598-ball.png");
        JumpObject ball = new JumpObject(pic);
        Rectangle rectangle = new Rectangle(10,10, 500, 500);

        rectangle.draw();
        pic.show();
        ball.jumpRight(30,4);

*/


        GameObjectFactory gameObjectFactory = new GameObjectFactory();

        RepresentablePics representablePics = new RepresentablePics("http://rs547.pbsrc.com/albums/hh459/Minda2009/Blaze%20the%20Cat/Possesdbyfire_zps68e3472f.jpg~c200");
       gameObjectFactory.createGameObjects(representablePics, GameObjectTypes.BALLOON).show();







    }


}
