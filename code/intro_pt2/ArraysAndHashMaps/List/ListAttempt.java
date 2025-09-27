package intro_pt2.ArraysAndHashMaps.List;

public class ListAttempt<Type>
{

    private Type[] values;
    private int firstFreeIndex;

    public ListAttempt() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }


    public void add(Type value) {
        if (firstFreeIndex >= values.length) {
            grow();
        }

        this.values[firstFreeIndex] = value;
        firstFreeIndex += 1;
    }

    private void grow() {
        int sizeIncrease = (this.values.length + this.values.length) / 2;
        Type[] increasedValues = (Type[]) new Object[sizeIncrease];
        for (int i = 0; i < this.values.length; i++) {
            increasedValues[i] = this.values[i];
        }
        this.values = increasedValues;
    }

    public boolean contains(Type value) {
        return indexOf(value) >= 0;
    }

    public void remove(Type value) {
        int indexOfValue = indexOf(value);
        if (indexOfValue < 0) {
            return;
        }
        moveValueLeft(indexOfValue);
        this.firstFreeIndex -= 1;
    }

    public int indexOf(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (value.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    private void moveValueLeft(int fromIndex) {
        for (int i = 0; i < firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public Type value(int index) {
        if (index >= this.firstFreeIndex || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }
}

