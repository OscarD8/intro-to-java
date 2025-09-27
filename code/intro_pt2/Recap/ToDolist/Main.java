package intro_pt2.Recap.ToDolist;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner   = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        UserInterface ui  = new UserInterface(toDoList, scanner);

        ui.start();
    }
}
