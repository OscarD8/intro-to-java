package intro_pt2.ExceptionHandling.SensorsAndTemp;

public class StandardSensor implements Sensor
{
    private int sensorNum;

    public StandardSensor(int num) {
        this.sensorNum = num;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.sensorNum;
    }
}
