package part6.JokeManage;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        UserInterface userInterface = new UserInterface(scanner, jokeManager);
        userInterface.start();
    }
}

