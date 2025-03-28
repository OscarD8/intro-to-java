package part6.ListsAndObjects;

import java.util.ArrayList;

public class Stack
{
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void addItem(String item) {
        stack.add(item);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        return this.stack.removeLast();
    }
}
