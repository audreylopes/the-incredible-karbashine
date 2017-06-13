package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public abstract class GameObject {



    private Position position;
    private CollisionChecker collisionChecker;
    private RepresentablePics picture;


    public GameObject(RepresentablePics picture) {
        this.picture = picture;
    }

    public Position getPosition(){
        return position;
    }

    public void setCollisionChecker(CollisionChecker collisionChecker) {
        this.collisionChecker = collisionChecker;
    }

    public CollisionChecker getCollisionChecker() {
        return collisionChecker;
    }


}
