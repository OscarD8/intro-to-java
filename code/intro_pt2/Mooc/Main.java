package intro_pt2.Mooc;

import intro_pt2.Mooc.Logic.ApplicationLogic;
import intro_pt2.Mooc.UI.TextInterface;
import intro_pt2.Mooc.UI.UserInterface;

public class Main
{
    public static void main(String[] args) {
        UserInterface userInterface = new TextInterface();
        new ApplicationLogic(userInterface).execute(3);
    }
}
