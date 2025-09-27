package intro_pt2.DataVisualisation.Calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CalculatorUI extends Application
{
    public static SavingsAccount savingsAccount;

    @Override
    public void start(Stage stage) {

        // LAYOUT
        BorderPane layout = new BorderPane();
        layout.setPrefSize(700, 480);
        layout.setPadding(new Insets(10));


        // LINECHART
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings");

        // TOP VBOX
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        BorderPane topPane1 = new BorderPane();
        BorderPane topPane2 = new BorderPane();

        // VBOX CONTENTS
        topPane1.setLeft(new Text("Monthly Savings"));
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setSnapToTicks(true);
        savingsSlider.setMajorTickUnit(25);
        savingsSlider.setMinorTickCount(5);
        topPane1.setCenter(savingsSlider);
        Text savingSliderValue = new Text(String.format("%.1f", savingsSlider.getValue()));

        topPane2.setLeft(new Text("Yearly Interest Rate"));
        Slider interestSlider = new Slider(0, 10, 0);
        topPane1.setRight(savingSliderValue);
        interestSlider.setShowTickLabels(true);
        interestSlider.setShowTickMarks(true);
        interestSlider.setSnapToTicks(true);
        interestSlider.setMajorTickUnit(10);
        interestSlider.setMinorTickCount(10);
        topPane2.setCenter(interestSlider);
        Text interestSliderValue = new Text(String.format("%.1f", interestSlider.getValue()));
        topPane2.setRight(interestSliderValue);
        vBox.getChildren().addAll(topPane1, topPane2);

        // LINECHART DATA
        XYChart.Series<Number, Number> savingsData = new XYChart.Series<>();
        updateData(savingsData);
        savingsData.setName("wo/ Interest");
        XYChart.Series<Number, Number> interestData = new XYChart.Series<>();
        updateInterest(interestData);
        interestData.setName("w/ Interest");

        // COMBINING LAYOUT
        layout.setTop(vBox);
        layout.setCenter(lineChart);
        lineChart.getData().add(savingsData);
        lineChart.getData().add(interestData);

        // DISPLAY SCENE
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        // LISTENING
        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            savingsAccount.initialiseSavings(newValue.intValue());
            updateData(savingsData);
            savingSliderValue.setText(String.format("%.1f", savingsSlider.getValue()));
            savingsAccount.initialiseInterest((int) interestSlider.getValue());
            updateInterest(interestData);
        });
        interestSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            savingsAccount.initialiseInterest(newValue.intValue());
            updateInterest(interestData);
            interestSliderValue.setText(String.format("%.1f", interestSlider.getValue()));
        });
    }

    private void updateData(XYChart.Series data) {
        data.getData().clear();
        for (int i = 0; i < savingsAccount.getSavings().size(); i++) {
            if (i == 0) {
                data.getData().add(new XYChart.Data<>(i, i));
            }
            data.getData().add(new XYChart.Data<>(i, savingsAccount.getValueAtIndex(i, savingsAccount.getSavings())));
        }
    }

    private void updateInterest(XYChart.Series data) {
        data.getData().clear();
        for (int i = 0; i < savingsAccount.getSavingsWithInterest().size(); i++) {
            if (i == 0) {
                data.getData().add(new XYChart.Data<>(i, i));
            }
            data.getData().add(new XYChart.Data<>(i, savingsAccount.getValueAtIndex(i, savingsAccount.getSavingsWithInterest())));
        }
    }
}
