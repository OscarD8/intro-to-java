package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Notifier extends Application
{
    @Override
    public void start(Stage window) {
        VBox layout = new VBox(30);
        Button button = new Button("Update");
        TextField textField = new TextField();
        Text textArea = new Text();

        layout.setSpacing(10);
        layout.getChildren().addAll(textField, button, textArea);

        button.setOnAction((actionEvent) -> {
            textArea.setText(textField.getText());
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
