package intro_pt2.JavaFX.SceneSwitching.Joke;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JokeApp extends Application
{
    @Override
    public void start(Stage stage) {
        AppState appState = new AppState();

        Label text = new Label("Click Joke to Begin");
        text.setWrapText(true);

        StackPane centerPane = new StackPane(text);
        centerPane.setPrefSize(400, 200);
        centerPane.setAlignment(Pos.CENTER);

        Button jokeBtn = new Button("Joke");
        Button answerBtn = new Button("Answer");
        Button explainBtn = new Button("Explain");

        HBox buttonBar = new HBox(10, jokeBtn, answerBtn, explainBtn);
        buttonBar.setAlignment(Pos.CENTER);
        buttonBar.setPadding(new Insets(20));

        BorderPane root = new BorderPane();
        root.setCenter(centerPane);
        root.setBottom(buttonBar);
        root.setPadding(new Insets(30));

        jokeBtn.setOnAction(actionEvent -> {
            Joke joke = appState.getJoke(appState.getRandomKey());
            text.setText(joke.getQuestion());
        });

        answerBtn.setOnAction(actionEvent -> {
            Joke joke = appState.getCurrentJoke();
            if (joke != null) {
                text.setText(joke.getAnswer());
            } else {
                text.setText("Click 'Joke' First");
            }
        });

        explainBtn.setOnAction(actionEvent -> {
            Joke joke = appState.getCurrentJoke();
            if (joke != null) {
                text.setText(joke.getExplanation());
            } else {
                text.setText("Click 'Joke' First");
            }
        });

        stage.setScene(new Scene(root));
        stage.show();
    }
}
