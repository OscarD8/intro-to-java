package intro_pt2.JavaFX.SceneSwitching.MultipleViews;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.function.Supplier;

public class MultipleViewsApp extends Application
{
    public void start(Stage stage) {

        Scene[] scenes = new Scene[3];

        scenes[0] = getFirstScene(stage, () -> scenes[1]);
        scenes[1] = getSecondScene(stage, () -> scenes[2]);
        scenes[2] = getThirdScene(stage, scenes[0]);

        stage.setScene(scenes[0]);
        stage.show();
    }

    private Scene getFirstScene(Stage stage, Supplier<Scene> nextScene) {
        BorderPane firstLayout = new BorderPane();
        Button firstViewButton = new Button("To the second view!");
        firstLayout.setTop(new Text("First View!"));
        firstLayout.setCenter(firstViewButton);

        firstViewButton.setOnAction(actionEvent -> stage.setScene(nextScene.get()));
        return new Scene(firstLayout);
    }

    private Scene getSecondScene(Stage stage, Supplier<Scene> nextScene) {
        VBox secondLayout = new VBox();
        Button secondViewButton = new Button("To the third view!");
        secondLayout.getChildren().addAll(secondViewButton, new Text("Second view!"));

        secondViewButton.setOnAction(actionEvent -> stage.setScene(nextScene.get()));
        return new Scene(secondLayout);
    }

    private Scene getThirdScene(Stage stage, Scene scene) {
        GridPane thirdLayout = new GridPane();
        Button thirdViewButton = new Button("To the first view!");
        thirdLayout.add(new Text("Third View!"), 0, 0);
        thirdLayout.add(thirdViewButton, 1, 1);

        thirdViewButton.setOnAction(actionEvent -> stage.setScene(scene));
        return new Scene(thirdLayout);
    }
}
