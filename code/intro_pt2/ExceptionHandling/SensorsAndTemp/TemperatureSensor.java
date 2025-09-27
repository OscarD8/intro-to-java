package intro_pt2.ExceptionHandling.SensorsAndTemp;

import java.util.Random;

public class TemperatureSensor implements Sensor
{
    private boolean status;

    public TemperatureSensor() {
        setOff();
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (!status) {
            throw new IllegalStateException("Sensor must be on!"); // if sensor on, return random int in range -30 - 30
        }
        return new Random().nextInt(61 ) - 30;
    }
}
