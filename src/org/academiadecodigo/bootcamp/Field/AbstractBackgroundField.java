package org.academiadecodigo.bootcamp.Field;

/**
 * Created by codecadet on 13/06/17.
 */
public abstract class AbstractBackgroundField implements Field,FieldPosition {


    private int x;
    private int y;
    LevelField levelField;
    ScoreField scoreField;
    SideMenuField sideMenuField;


    public AbstractBackgroundField() {
        levelField = new LevelField();
        scoreField = new ScoreField();
        sideMenuField = new SideMenuField();
    }


    @Override
    public void init() {
        show();

    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public FieldPosition makePosition() {
        return null;
    }

    @Override
    public FieldPosition getPosition() {
        return null;
    }

    @Override
    public void show() {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void hide() {

    }
}
