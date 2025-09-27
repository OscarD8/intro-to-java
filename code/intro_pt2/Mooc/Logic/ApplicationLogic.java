package intro_pt2.Mooc.Logic;

import intro_pt2.Mooc.UI.UserInterface;

public class ApplicationLogic
{
    UserInterface userInterface;

    public ApplicationLogic(UserInterface ui) {
        userInterface = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            userInterface.update();
        }
    }
}
