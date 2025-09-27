package intro_pt2.RegularExpressions;

public class TimeOfDay
{
    public static void main(String[] args) {
        TimeOfDay timeOfDay = new TimeOfDay();
        System.out.println(timeOfDay.timeOfDay("2:01:00"));
    }

    public boolean timeOfDay(String string) {
        return string.matches("[0-2][0-3]:[0-5][0-9]:[0-5][0-9]");
    }


}
