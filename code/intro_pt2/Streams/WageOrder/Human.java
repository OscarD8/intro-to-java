package intro_pt2.Streams.WageOrder;

public class Human implements Comparable<Human>
{
    private String name;
    private double wage;

    public Human(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if (this.wage - o.wage > 0) {
            return 1;
        }
        else if (this.wage - o.wage < 0) {
            return -1;
        }
        return 0;
    }
}
