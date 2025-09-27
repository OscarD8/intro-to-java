package intro_pt2.JavaFX.TicTac;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application
{
    private static final int SIZE = 3;
    private Button[][] board = new Button[SIZE][SIZE];
    private Player currentPlayer = Player.X;
    private Text turnText;

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        GridPane grid = createBoard();
        turnText = new Text("Turn: " + currentPlayer.toString());

        layout.setTop(turnText);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane createBoard() {
        GridPane grid = new GridPane();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                Button cell = createCell(row, col);
                board[row][col] = cell;
                grid.add(cell, row, col);
            }
        }

        return grid;
    }

    private Button createCell(int row, int col) {
        Button cell = new Button();
        cell.setPrefSize(100, 100);
        cell.setStyle("-fx-font-size: 24px");

        cell.setOnAction(e -> handleMove(cell, row, col));
        return cell;
    }

    private void handleMove(Button cell, int row, int col) {
        String symbol = currentPlayer.toString();

        if (!cell.getText().isEmpty()) return;

        cell.setText(currentPlayer.toString());


        if (isWinningMove(row, col)) {
            System.out.println("Player " + currentPlayer + " wins!");
            disableBoard();
        } else {
            togglePlayer();
        }
    }

    private boolean isWinningMove(int row, int col) {
        String symbol = currentPlayer.toString();

        return (
                checkLine(symbol, row, 0, 0, 1) ||
                checkLine(symbol, 0, col, 1, 0) ||
                (row == col && checkLine(symbol, 0, 0, 1, 1)) || // Diagonal TL-BR
                (row + col == SIZE - 1 && checkLine(symbol, 0, SIZE - 1, 1, -1)) // Diagonal TR-BL
                );
    }

    private boolean checkLine(String symbol, int startRow, int startCol, int deltaRow, int deltaCol) {
        for (int i = 0; i < SIZE; i++) {
            if (!symbol.equals(board[startRow + i * deltaRow][startCol + i * deltaCol].getText())) {
                return false;
            }
        }
        return true;
    }

    private void togglePlayer() {
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X;
        turnText.setText("Turn: " + currentPlayer);
    }

    private void disableBoard() {
        for (Button[] row : board) {
            for (Button cell : row) {
                cell.setDisable(true);
            }
        }
    }

    private enum Player {
        X, O
    }
}
