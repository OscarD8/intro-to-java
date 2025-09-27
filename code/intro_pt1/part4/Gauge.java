package intro_pt1.part4;

public class Gauge
{
    private int value;

    public Gauge(){
        this.value = 0;
    }

    public void increase(){
        if (value <= 5) {
            this.value += 1;
        }
    }

    public void decrease(){
        if (value >= 0)
            this.value -= 1;
    }

    public int getValue() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
