package Application;

import Input.Buttonchik;
import Macroses.KeyMacros;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        System.out.printf("Введите макрос (клавиша1 задержка1 клавиша2): ");
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        System.out.println(s);

        for(String i: s.split(" ")){


            Buttonchik button = new Buttonchik()
        }

    }
}