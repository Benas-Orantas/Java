package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor{

    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        int on = (int) sensors.stream().filter(s -> s.isOn()).count();
        if (on == sensors.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int reading = sensors.stream().mapToInt(Sensor::read).sum() / sensors.size();
            readings.add(reading);
            return reading;
        }
    }
}
