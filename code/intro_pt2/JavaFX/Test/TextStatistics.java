package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextStatistics extends Application
{
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea("Everything just goes away..."));

        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Text("Letters: 0"));
        texts.getChildren().add(new Text("Words: 0"));
        texts.getChildren().add(new Text("The longest word is: "));

        layout.setBottom(texts);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
