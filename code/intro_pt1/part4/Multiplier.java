package intro_pt1.part4;

public class Multiplier
{
    private final int multiplier;

    public Multiplier(int number) {
        this.multiplier = number;
    }

    public int multiply(int number){
        return number * multiplier;
    }
}
