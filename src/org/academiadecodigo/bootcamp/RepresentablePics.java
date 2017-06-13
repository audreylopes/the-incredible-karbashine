package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/06/2017.
 */
public class RepresentablePics {

    private Picture p;

    public RepresentablePics(String str) {
        this.p = new Picture(0, 0, str);
    }

    public static final RepresentablePics BASKETBALL = new RepresentablePics("http://contraptionmaker.com/wp-content/uploads/2015/05/Incredible-Machine-Sprites.jpg");
    public static final RepresentablePics BASEBALL = new RepresentablePics("https://files.slack.com/files-pri/T5REN8ZBM-F5SA7GDB2/image.png");
    public static final RepresentablePics BOWLINGBALL = new RepresentablePics("");
    public static final RepresentablePics CANNONBAL = new RepresentablePics("");
    public static final RepresentablePics BALLOON = new RepresentablePics("");
    public static final RepresentablePics RAMP = new RepresentablePics("");
    public static final RepresentablePics BELT = new RepresentablePics("");
    public static final RepresentablePics BRICKS = new RepresentablePics("");
    public static final RepresentablePics PIPES = new RepresentablePics("");
    public static final RepresentablePics BOXGLOVES = new RepresentablePics("");
    public static final RepresentablePics GUN = new RepresentablePics("");
    public static final RepresentablePics WINDBLOWER = new RepresentablePics("");
    public static final RepresentablePics CANNON = new RepresentablePics("");
    public static final RepresentablePics CANDLE = new RepresentablePics("");
    public static final RepresentablePics CONVEYOR = new RepresentablePics("");
    public static final RepresentablePics MOTOR = new RepresentablePics("");
    public static final RepresentablePics SEESAW = new RepresentablePics("");
    public static final RepresentablePics TRAMPOLINE = new RepresentablePics("");


}
