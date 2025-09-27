package intro_pt2.Recap.ToDolist;

import java.util.ArrayList;


public class ToDoList
{
    private ArrayList<String> taskList;


    public ToDoList() {
        taskList = new ArrayList<>();
    }


    public void addTask(String task) {
        if (!(taskList.contains(task))) {
            taskList.add(task);
        }
    }

    public void removeTask(int index) {
        taskList.remove(index-1);
    }

    public void listTasks() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + ": " + taskList.get(i));
        }
    }
}
