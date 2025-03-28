package part5.OOPpart2;

public class Clock
{
    ClockHand seconds;
    ClockHand minutes;
    ClockHand hours;

    public Clock(){
        this.seconds = new ClockHand(60);
        this.minutes = new ClockHand(60);
        this.hours = new ClockHand(24);
    }

    public void tick() {
        this.seconds.advance();
        if (this.seconds.getValue() == 0) {
            this.minutes.advance();
            if (this.minutes.getValue() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
