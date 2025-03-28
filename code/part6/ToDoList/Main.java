package part6.ToDoList;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        TodoList saturday = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner, saturday);

        userInterface.start();
    }
}

//you get a grade from a score and  you add it to a list based on fixed integer value
//establish grade as 5 and then while that is greater than 0
//for each grade in grades, if that grade == grade add a star
//
