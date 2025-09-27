package intro_pt2.Inheritance.Warehousing;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory
{
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
       this.changeHistory = new ArrayList<>();
    }


    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public double maxValue() {
     return Collections.max(changeHistory);
    }

    public double minValue() {
        return Collections.min(changeHistory);
    }

    public double average() {
        double sum = 0;

        if (!changeHistory.isEmpty()) {
            for (double entry : changeHistory) {
                sum += entry;
            }
            return sum / changeHistory.size();
        }

        return 0;
    }


    public String toString() {
        return changeHistory.toString();
    }
}
