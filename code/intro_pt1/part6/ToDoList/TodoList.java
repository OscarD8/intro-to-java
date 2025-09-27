package intro_pt1.part6.ToDoList;

import intro_pt1.part6.CleanCode.WordList;

public class TodoList
{
    private final WordList tasks;

    public TodoList() {
        this.tasks = new WordList();
    }

    public void add(String task) {
        if (this.tasks.contains(task)) {
            System.out.println("Task already added: " + task);
            return;
        }
        this.tasks.add(task);
    }

    public void print() {
        int index = 1;
        for (String word : tasks.getList()) {
            System.out.println(index + ": " + word);
            index ++;
        }
    }

    public void remove(int number) {
        tasks.removeIndex(number);
    }
}
