package Input;

import javafx.scene.input.KeyCode;

public class Buttonchik {
    private KeyCode type; // Тип нажатой клавиши

    private int period; // Время нажатия

    private int delay; // Задержка после нажатия

    //---------------------------------------------------------------------


    public Buttonchik(KeyCode type, int period, int delay) {
        this.type = type;
        this.period = period;
        this.delay = delay;
    }
}
