package part5.OverloadingMethodsAndConstructors;

public class Counter
{
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int incValue) {
        this.value += incValue;
    }

    public void decrease(int decValue) {
        this.value -= decValue;
    }

}
