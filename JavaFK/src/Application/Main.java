package Application;

import Input.Buttonchik;
import Macroses.KeyMacros;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import java.util.List;
import java.util.Scanner;

public class Main  {

    private static final int period = 250;

    public static void main(String[] args) {

        KeyMacros mac1 = new KeyMacros();

        System.out.printf("Введите макрос (клавиша1 задержка1 клавиша2): ");
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();



        // Задание макроса
        Buttonchik button = new Buttonchik();
        boolean is_button = true;
        for(String i: s.split(" ")){
            if(is_button){
                button = new Buttonchik(KeyCode.getKeyCode(i), period, 0);
                button.setType(KeyCode.getKeyCode(i));
                mac1.add_button(button);
                is_button = false;
            }else{
                button.setDelay(Integer.parseInt(i));
                is_button = true;
            }
        }

        System.out.print("Назначьте клавишу активации макроса: ");
        s = input.next();
        mac1.add_key(s);

        System.out.println(mac1);

        System.out.println("Макрос успешно создан");


    }
}