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



    public KeyMacros (){
        combination = new ArrayList<Buttonchik>();
    };

    private void set_combination(ArrayList<Buttonchik> combination){ // создание комбинации
        this.combination = combination;
    }

    public void add_button(Buttonchik knopka){
        combination.add(knopka);
    }

    public void add_key(KeyCode key){
        this.key = key;
    }

    public void add_key(String key){
        this.key = KeyCode.getKeyCode(key);
    }

    public ArrayList<Buttonchik> get_combination(){
        return combination;
    }

    public KeyCode getKey() {
        return key;
    }

    @Override
    public String toString() {
        String S = "Комбинация: ";
        for (Buttonchik i: combination){
            S += i + " , ";
        }
        S += '\n';
        S += key;
        return S;
    }
}
