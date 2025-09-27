package intro_pt2.DataVisualisation.Calculator;

import javafx.application.Application;

public class Main
{
    public static void main(String[] args) {
        CalculatorUI.savingsAccount = new SavingsAccount(0, 0);

        Application.launch(CalculatorUI.class);
    }
}
