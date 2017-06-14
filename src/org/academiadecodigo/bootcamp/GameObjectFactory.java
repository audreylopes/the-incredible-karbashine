package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.*;
import org.academiadecodigo.bootcamp.gameobjects.jumpobjects.BaseBall;
import org.academiadecodigo.bootcamp.gameobjects.jumpobjects.BowlingBall;
import org.academiadecodigo.bootcamp.gameobjects.jumpobjects.CannonBall;
import org.academiadecodigo.bootcamp.gameobjects.pushobjects.BoxGlove;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 12/06/17.
 */
public class GameObjectFactory  {

    GameObjectTypes gameObjectTypes;

    public GameObject createGameObjects(RepresentablePics representablePics, GameObjectTypes gameObjectTypes) {

        GameObject gameObject;
        RepresentablePics representablePics1 = new RepresentablePics("http://rs547.pbsrc.com/albums/hh459/Minda2009/Blaze%20the%20Cat/Possesdbyfire_zps68e3472f.jpg~c200");

        switch (gameObjectTypes) {
            //Ver o novo metodo pa ver se é alguma coisa de jeito,Ver quando passar a picture.
            case GUN:
                gameObject = new Gun(representablePics);
                break;
            case BELT:
               gameObject = new Belt(representablePics);
               break;
            case RAMP:
                gameObject = new Ramp(representablePics);
                break;
            case MOTOR:
                gameObject = new ElectricMotor(representablePics);
                break;
            case PIPES:
                gameObject = new Pipe(representablePics);
                break;
            case BRICKS:
                gameObject = new Brick(representablePics);
                break;
            case CANDLE:
                gameObject = new Candle(representablePics);
                break;
            case CANNONBAL:
                gameObject = new CannonBall(representablePics);
                break;
            case SEESAW:
               gameObject = new Seesaw(representablePics);
               break;
            case BALLOON:
                gameObject = new Balloon(representablePics);
                break;
            case BASEBALL:
                gameObject = new BaseBall(representablePics);
                break;
            case CONVEYOR:
                gameObject = new Conveyor(representablePics);
                break;
            case BOXGLOVES:
                gameObject = new BoxGlove(representablePics);
                break;
            case TRAMPOLINE:
                gameObject = new Trampoline(representablePics);
                break;
            case WINDBLOWER:
                gameObject = new WindBlower(representablePics);
                break;
            case BOWLINGBALL:
                gameObject = new BowlingBall(representablePics);
                break;
             default:
                 return null;
        }
        return gameObject;
    }




}
