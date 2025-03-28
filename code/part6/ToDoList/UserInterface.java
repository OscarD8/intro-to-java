package part6.ToDoList;

import java.util.Scanner;

public class UserInterface
{
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("stop")) {
                System.out.println("Bye");
                break;
            } else if (userInput.equalsIgnoreCase("add")) {
                System.out.print("Task: ");
                todoList.add(scanner.nextLine());
            } else if (userInput.equalsIgnoreCase("list")) {
                todoList.print();
            } else if (userInput.equalsIgnoreCase("remove")) {
                System.out.print("Enter task number to delete: ");
                todoList.remove(Integer.parseInt(scanner.nextLine()));
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
