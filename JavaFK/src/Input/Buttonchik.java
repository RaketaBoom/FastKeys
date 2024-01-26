package Input;

import javafx.scene.input.KeyCode;

public class Buttonchik {
    private KeyCode type; // Тип нажатой клавиши, учитываются даже спец. клавиши и ненажатие

    private long period; // Время нажатия

    public Buttonchik(KeyCode type, long period){
        this.type = type;
        this.period = period;
    }

}
