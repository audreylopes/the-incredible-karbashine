package org.academiadecodigo.bootcamp.buttons;

import org.academiadecodigo.bootcamp.Clickable;
import org.academiadecodigo.bootcamp.Clicker;


/**
 * Created by codecadet on 13/06/2017.
 */
public class PuzzleSelectionModeButton implements Clickable{


    Clicker clicker;

    public PuzzleSelectionModeButton() {
    clicker = new Clicker(this);
    }

    //Implemtar o codigo em whenClick para depois ser executado;
    @Override
    public void whenClick() {

    }

}
