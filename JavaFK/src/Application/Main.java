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

    private static final int delay = 250;

    public static void main(String[] args) {

        KeyMacros mac1 = new KeyMacros();

        System.out.printf("Введите макрос (клавиша1-задержка1 клавиша2-задержка2): ");
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        System.out.println(s);

        for(String i: s.split(" ")){
            String[] tmp = i.split("-");
            Buttonchik button = new Buttonchik(KeyCode.getKeyCode(tmp[0]), Integer.parseInt(tmp[1]), delay);
            mac1.add_button(button);
        }

        System.out.println(mac1);


    }
}