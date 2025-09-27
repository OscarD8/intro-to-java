package intro_pt2.RegularExpressions;

public class DayOfWeek
{
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        System.out.println(dayOfWeek.isDayOfWeek("tue"));
    }

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue"); //etc
    }
}
