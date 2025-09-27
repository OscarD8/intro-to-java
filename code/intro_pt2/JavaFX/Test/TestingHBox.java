package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestingHBox  extends Application
{
    @Override
    public void start(Stage scene) {
        HBox layout = new HBox();
        layout.setSpacing(10);

        layout.getChildren().add(new Label("first"));
        layout.getChildren().add(new Label("second"));
        layout.getChildren().add(new Label("third"));

        Scene view = new Scene(layout);
        scene.setScene(view);
        scene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
