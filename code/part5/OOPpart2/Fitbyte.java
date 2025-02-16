package code.part5.OOPpart2;

public class Fitbyte
{
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (hrm() - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }

    public double hrm() {
        return 206.3 - (0.67 * this.age);
    }

}
