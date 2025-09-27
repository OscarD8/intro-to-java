package intro_pt2.Recap.ToDolist;

import java.util.Scanner;


public class UserInterface
{
    private ToDoList taskList;
    private Scanner scanner;


    public UserInterface(ToDoList toDoList, Scanner  scanner) {
        this.taskList = toDoList;
        this.scanner = scanner;
    }


    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine().toLowerCase().trim();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add":
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskList.addTask(taskName);
                    break;
                case "remove":
                    System.out.print("Enter index: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    taskList.removeTask(index);
                    break;
                case "list":
                    taskList.listTasks();
                    break;
            }

            System.out.println();
        }
    }
}
