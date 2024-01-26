package Macroses;


import Input.Buttonchik;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.animation.AnimationTimer;

import java.util.ArrayList;

public class KeyMacros {
    private ArrayList<Buttonchik> combination; // Комбинация выводимых клавиш

    private KeyCode key; // Кнопка-активация


    //----------------------------------------------------------------

    private void set_combination(KeyEvent event){ // создание комбинации
        while(true){

        }
    }

    public KeyMacros(KeyEvent event){
        set_combination(event);
    }

    public ArrayList<Buttonchik> get_combination(){
        return combination;
    }
}
