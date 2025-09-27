package intro_pt2.Inheritance.Counter;

public class SuperCounter  extends Counter
{
    @Override
    public int addToNumber(int number) {
        return number + 5;
    }
}
