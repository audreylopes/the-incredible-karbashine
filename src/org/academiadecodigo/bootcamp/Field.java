package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 12/06/17.
 */
public interface Field {

    void init();

    FieldPosition makePosition();

    FieldPosition getPosition();

    void show();

}
