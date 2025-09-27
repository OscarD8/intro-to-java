package intro_pt2.ExceptionHandling.SensorsAndTemp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor
{
    private List<Sensor> sensors;
    private boolean status;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        setOff();
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
        this.status = true;
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
        this.status = false;
    }

    @Override
    public int read() {
        validateSensorStatus();

        int sum = sensors.stream()
                .mapToInt(Sensor::read)
                .sum();

        return sum / sensors.size();
    }

    public void validateSensorStatus() {
        if (!this.status) {
            throw new IllegalStateException("Average Sensor is off.");
        }
        if (sensors.isEmpty()) {
            throw new IllegalStateException("No sensors monitored by the Average Sensor.");
        }
    }

    public List<Integer> readings() {
        validateSensorStatus();

        return sensors.stream()
                .map(Sensor::read)
                .collect(Collectors.toList());
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
}
