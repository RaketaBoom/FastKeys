package Application;

import Input.Buttonchik;
import Macroses.KeyMacros;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.scene.layout.Pane;

public class FastKeys extends Application {

    private static final int period = 250;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){


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

        input.close();

        System.out.println(mac1);

        System.out.println("Макрос успешно создан");

        Pane root = new Pane();  // Создается корневой javafx-узел
        Scene scene = new Scene(root); // Узел помещается на сцену

        Robot robot = new Robot(); // Создаем робота для нажатий
        scene.setOnKeyPressed(keyEvent -> {    // Лямбда-выражение ловит кнопку активации
            if (keyEvent.getCode() == mac1.getKey()){
                System.out.println("FastKeys is working!"); // Если поймало, пишет это в консоль
                for(Buttonchik i: mac1.get_combination()){ // И робот нажимает по комбинации, выдерживая время как надо
                    robot.keyPress(i.getType());
                    try {
                        Thread.sleep(i.getPeriod());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    robot.keyRelease(i.getType());
                    try {
                        Thread.sleep(i.getDelay());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("KeyPress Example");
        primaryStage.show();

    }
}