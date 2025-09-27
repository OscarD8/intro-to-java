package intro_pt2.JavaFX.SceneSwitching.Greeting;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class SceneFactory
{
    public static Scene generateGreeter(SceneRouter sceneRouter, AppState appState) {
        Label instructionText    = new Label("Enter your name and start.");
        TextField usernameField  = new TextField();
        Button confirmNameButton = new Button("Confirm");
        Label errorMessage       = new Label("Please enter a name.");

        GridPane gridPane = new GridPane();
        gridPane.add(instructionText, 0, 0);
        gridPane.add(usernameField, 0, 1);
        gridPane.add(confirmNameButton, 0, 2);

        gridPane.setPrefSize(300, 180);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(20));

        confirmNameButton.setOnAction(actionEvent ->  {
            if (usernameField.getText().isEmpty()) {
                gridPane.add(errorMessage, 0, 3);
                return;
            }
            appState.setUsername(usernameField.getText());
            sceneRouter.setScene(SceneKey.CONFIRMATION);
        });

        return new Scene(gridPane);
    }

    public static Scene generateConfirmation(AppState appState) {
        GridPane layout = new GridPane(300, 180);
        Label username = new Label("Welcome " + appState.getUsername());

        layout.add(username, 0, 0);

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20));

        return new Scene(layout);
    }
}
