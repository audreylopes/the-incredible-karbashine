package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public abstract class GameObject implements Representable, Pickable {


    private Position position;
    private CollisionChecker collisionChecker;
    private RepresentablePics picture;
    private boolean collision;
    private DirectionTypes direction;
    private GameObjectTypes gameObjectTypes;


    public GameObject(RepresentablePics picture) {
        this.picture = picture;
    }

    public GameObject() {

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

    protected void setPosition(int x, int y){
        this.position.setX(x);
        this.position.setY(y);
    }

    @Override
    public int getX() {
        return position.getX();
    }

    @Override
    public int getY() {
        return position.getY();
    }

    @Override
    public void show() {

    }
}
