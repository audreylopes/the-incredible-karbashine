package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public abstract class GameObject {



    private Position position;

    private RepresentablePics picture;

    public GameObject(RepresentablePics picture) {
        this.picture = picture;
    }

    public Position getPosition(){
        return position;
    }


}
