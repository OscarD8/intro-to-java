package intro_pt2.Interfaces.Herds;

import java.util.ArrayList;

public class Herd implements Moveable
{
    private ArrayList<Moveable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }


    public void addToHerd(Moveable moveable) {
        herd.add(moveable);
    }

    public void move(int dx, int dy) {
        for (Moveable object : herd) {
            object.move(dx, dy);
        }
    }

    public String toString() {
        StringBuilder heardAsString = new StringBuilder();

        for (Moveable object : herd) {
            heardAsString.append(object.toString());
            heardAsString.append("\n");
        }

        return heardAsString.toString();
    }
}
