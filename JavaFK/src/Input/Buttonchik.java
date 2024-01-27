package Input;

import javafx.scene.input.KeyCode;

public class Buttonchik {
    private KeyCode type; // Тип нажатой клавиши

    private int period; // Время нажатия

    private int delay; // Задержка после нажатия

    //---------------------------------------------------------------------


    public Buttonchik(){}

    public Buttonchik(int period, int delay){
        this.period = period;
        this.delay = delay;
    }

    public Buttonchik(KeyCode type, int period, int delay) {
        this.type = type;
        this.period = period;
        this.delay = delay;
    }

    public KeyCode getType() {
        return type;
    }



    public int getPeriod() {
        return period;
    }

    public int getDelay() {
        return delay;
    }

    public void setType(KeyCode type) {
        this.type = type;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "Buttonchik{" +
                "type=" + type +
                ", period=" + period +
                ", delay=" + delay +
                '}';
    }
}
