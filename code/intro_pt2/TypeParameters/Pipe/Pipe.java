package intro_pt2.TypeParameters.Pipe;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Pipe <T>
{
    private List<T> itemsInPipe;

    public Pipe(){
        itemsInPipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        itemsInPipe.add(value);
    }

    public T takeFromPipe() {
        try {
            return itemsInPipe.removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public boolean isInPipe() {
        return !itemsInPipe.isEmpty();
    }
}
