package intro_pt1.part4;

public class Whistle
{
    private final String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound(){
        System.out.println(sound);
    }
}
