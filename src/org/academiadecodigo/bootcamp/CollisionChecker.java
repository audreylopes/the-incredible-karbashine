package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 13/06/2017.
 */
public class CollisionChecker {


    private GameObject[] gameObjects;

    public CollisionChecker(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    public boolean checksCollision(GameObject currentObject) {

        for (int i = 0; i < this.gameObjects.length; i++) {
            if (currentObject == gameObjects[i]) {
                continue;
            }
            if (currentObject.getPosition().equals(gameObjects[i].getPosition())) {
                return true;
            }
        }
        return false;

    }


}
