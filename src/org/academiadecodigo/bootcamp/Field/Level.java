package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 15/06/17.
 */
public class Level extends LevelField {

    private boolean isCompleted;
    private Picture p;

    public Level(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Level() {

    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void completed(){
        isCompleted = true;
    }

    public Picture getP(){
        return p;
    }


}
