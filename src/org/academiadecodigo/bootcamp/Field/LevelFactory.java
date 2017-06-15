package org.academiadecodigo.bootcamp.Field;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

/**
 * Created by codecadet on 15/06/17.
 */
public class LevelFactory {

    private final static int LEVELNUMBER = 3;
    LinkedList levels;


    public void levelCreator() {

        for (int i = 0; i <= LEVELNUMBER; i++) {

            switch (i) {
                case 0:
                    levels.add(new LevelStart(false));
                    break;
                case 1:
                    levels.add(new Level1(false));
                    break;
                case 2:
                    levels.add(new Level2(false));
                    break;
                case 3:
                    levels.add(new Level3(false));
                    break;
                default:
                    break;
            }
        }

    }


    public void nextLevel() {

        for (int i = 0; i < levels.size(); i++) {

            if (levels.get(i) instanceof Level) {
                Level currentLevel = (Level) levels.get(i);

                if (!currentLevel.isCompleted()) {
                    currentLevel.show();
                    break;
                }

            }

        }
    }
}
