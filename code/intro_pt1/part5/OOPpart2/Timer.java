package intro_pt1.part5.OOPpart2;

public class Timer
{
    private final ClockHand hundredths;
    private final ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void tick() {
        this.hundredths.advance();
        if (this.hundredths.getValue() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + "0" + this.hundredths;
    }
}
