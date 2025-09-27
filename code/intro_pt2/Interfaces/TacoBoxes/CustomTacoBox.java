package intro_pt2.Interfaces.TacoBoxes;

public class CustomTacoBox implements TacoBox
{
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public void eat() {
        tacos -= 1;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }
}
