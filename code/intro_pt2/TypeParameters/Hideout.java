package intro_pt2.TypeParameters;


public class Hideout<T>
{
    private T object;

    public void putIntoHideout(T toHide) {
        this.object = toHide;
    }

    public T takeFromHideout() {
        T removedObject = this.object;
        this.object = null;
        return removedObject;
    }

    public boolean isInHideout() {
        return this.object != null;
    }
}
