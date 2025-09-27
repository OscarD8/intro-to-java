package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class HealthStation
{
    private int weighingsCount;

    public HealthStation() {
        this.weighingsCount = 0;
    }

    public int weigh(Person person) {
        this.weighingsCount += 1;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight((person.getWeight() + 1));
    }
    public int getWeighingsCount(){
        return this.weighingsCount;
    }
}
