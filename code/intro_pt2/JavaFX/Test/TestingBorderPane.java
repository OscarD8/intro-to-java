package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestingBorderPane extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        javafx.scene.layout.BorderPane layout = new javafx.scene.layout.BorderPane();

        layout.setTop(new Text("North"));
        layout.setRight(new Text("East"));
        layout.setLeft(new Text("West"));
        layout.setBottom(new Text("South"));

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // calls start()
    }
}
