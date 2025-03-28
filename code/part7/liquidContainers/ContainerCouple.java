package part7.liquidContainers;

public class ContainerCouple
{
    Container containerA;
    Container containerB;

    public ContainerCouple() {
        containerA = new Container();
        containerB = new Container();
    }

    public void setAmount(int amount) {
        containerA.setAmount(containerA.getFill() + amount);
    }

    public void moveAmount(int amount) {
        if (amount <= 0) {
            return;
        }
        else if (containerB.getFill() + amount > containerB.getCapacity()){
            containerB.setAmount(100);
            containerA.setAmount(containerA.getFill() - amount);
        }
        else if (amount > containerA.getFill()) {
            containerB.setAmount(containerA.getFill());
            containerA.setAmount(0);
        }
        else {
            containerB.setAmount(amount + containerB.getFill());
            containerA.setAmount(containerA.getFill() - amount);
        }
    }

    public void removeAmount(int amount) {
        containerB.setAmount(containerB.getFill() - amount);
    }

    @Override
    public String toString() {
        return  "Containers Status:\n" +
                "First  Container| "   + containerA + "\n" +
                "Second Container| "   + containerB + "\n";
    }
}
