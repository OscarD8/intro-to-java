package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionalTextStats extends Application
{
    @Override
    public void start(Stage window) {
        // Creating the components and the Stage
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea();
        HBox statsBox     = new HBox(10);

        // Setting up the updatable text fields
        Text letters     = new Text("Letters: " + 0);
        Text words       = new Text("Words: "   + 0);
        Text longestWord = new Text("Longest word: ");

        statsBox.getChildren().addAll(letters, words, longestWord);

        // Updating layout with components
        layout.setBottom(statsBox);
        layout.setCenter(textArea);

        // Event listener
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            updateStats(newValue, letters, words, longestWord);
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    private int countCharacters(String text) {
        return text.length();
    }

    private int countWords(String text) {
        return text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
    }

    private String findLongestWord(String text) {
        return Arrays.stream(text.trim().split("\\s+"))
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    private void updateStats(String newValue, Text letters, Text words, Text longestWord) {
        letters.setText("Letters: " + countCharacters(newValue));
        words.setText("Words: " + countWords(newValue));
        longestWord.setText("Longest word: " + findLongestWord(newValue));
    }



    public static void main(String[] args) {
        launch(args);
    }
}
